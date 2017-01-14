<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bookcamp2.UsersDAO" %>
<%@ page import="bookcamp2.Users" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <title>Book Camp</title>
  <link href="login.css" rel="stylesheet">
  <link href="carousel.css" rel="stylesheet">
  <link rel="icon" href="favicon.png">
  <!-- Bootstrap -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
 <%UsersDAO udao = new UsersDAO();
 	udao.open();
 	int check=0;
 	for (Users s: udao.getUsers())
 		 if (s.getUsername().equals(request.getParameter("username"))){ %>
 			 <%@include file="registerbody.html" %>
 			 <% break;}
 	if (!request.getParameter("password").equals(request.getParameter("password_confirm"))){%>
 		<%@include file="registerbody.html" %>
 	<% }else {
 		int year = Integer.parseInt(request.getParameter("year"));
 	Users x = new Users(1,request.getParameter("username"),request.getParameter("password"), request.getParameter("name"), request.getParameter("surname"), year, request.getParameter("gender"));
 	udao.registerUser(x); 
 	session.setAttribute("user",x);%>	
 	<br><br>
 		<h4 align=center>Register Successful</h4>
 		<%@include file="logedin.jsp" %>
 	<% }%>