<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
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
  <link href="carousel.css" rel="stylesheet">
  <link href="login.css" rel="stylesheet">
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
<body>
<% Users u=(Users)session.getAttribute("user");
			if (u==null) {%>
	<jsp:forward page="login.html" /><%} %>
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#"><img alt="Brand" src="logo.png" width=190 height=35></a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active"><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Categories <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">Comedy</a></li>
              <li><a href="#">Drama</a></li>
              <li><a href="#">Fiction</a></li>
              <li><a href="#">Children's</a></li>
              <li><a href="#">Fanatasy</a></li>
              <li><a href="#">Historical Fiction</a></li>
              <li><a href="#">Play</a></li>
              <li><a href="#">Science Fiction</a></li>
              <li><a href="#">Young adult</a></li>
            </ul>
          </li>
        </ul>
        <form class="navbar-form navbar-left">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Search" size=70%>
          </div>
          <button type="submit" class="btn btn-default">Submit</button>
        </form>
        <ul class="nav navbar-nav navbar-right">
         	<li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <%out.print(u.getUsername()); %> <span class="caret"></span></a>
         		<ul class="dropdown-menu">
        			<li><a href="profile.jsp">My profile</a></li>
              		<li><a href="index.html">Log out</a></li>
              		<li><a href="remove.jsp">Delete Account</a></li>
        		</ul></li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>

  <br>  <br>  <br>

  <div class="row">
    <!--sidebar categories -->
    <div class="col-lg-3">
      <div class="panel panel-default">
        <div class="panel-heading" align=left>Categories</div>
          <ul align=left>
            <li><a href="#">Comedy</a></li>
            <li><a href="#">Drama</a></li>
            <li><a href="#">Fiction</a></li>
            <li><a href="#">Children's</a></li>
            <li><a href="#">Fanatasy</a></li>
            <li><a href="#">Historical Fiction</a></li>
            <li><a href="#">Play</a></li>
            <li><a href="#">Science Fiction</a></li>
            <li><a href="#">Young adult</a></li>
          </ul>
      </div>
    </div>
    <!--close sidebar categories -->
<!-- register -->
    <div class="col-lg-6" align=center>
    	<div class="logo">Account</div>
    	<!-- Main Form -->
    	<div class="login-form-1" align=left>
    		<form id="register-form" class="text-left" action="profileresult.jsp" method="post">
    			<div class="login-form-main-message"></div>
    			<div class="main-login-form">
    				<div class="login-group">
    					<div class="form-group">
    						<label for="username" class="sr-only">Username</label>
    						<input type="text" class="form-control" id="username" name="username" value="<%out.print(u.getUsername()); %>" placeholder="<%out.print(u.getUsername()); %>">
    					</div>
    					<div class="form-group">
    						<label for="password" class="sr-only">Old Password</label>
    						<input type="password" class="form-control" id="password" name="password" value="<%out.print(u.getPassword()); %>" placeholder="<%out.print(u.getPassword()); %>" disabled="disabled">
    					</div>
    					<div class="form-group">
    						<label for="password" class="sr-only">New Password</label>
    						<input type="password" class="form-control" id="password" name="npassword" placeholder="new password">
    					</div>
    					<div class="form-group">
    						<label for="password_confirm" class="sr-only">Confirm new Password</label>
    						<input type="password" class="form-control" id="password_confirm" name="conpassword" placeholder="confirm new password">
    					</div>

    					<div class="form-group">
    						<label for="name" class="sr-only">Name</label>
    						<input type="text" class="form-control" id="name" name="name" value="<%out.print(u.getName());%>" placeholder="<%out.print(u.getName());%>">
    					</div>

              			<div class="form-group">
    						<label for="surname" class="sr-only">Surname</label>
    						<input type="text" class="form-control" id="surname" name="surname" value="<%out.print(u.getSurname());%>" placeholder="<%out.print(u.getSurname());%>">
    					</div>

    					<div class="form-group">
    						<label for="year" class="sr-only">Year of birth</label>
    						<input type="text" class="form-control" id="age" name="year" value="<%out.print(u.getBirth_year());%>" placeholder="<%out.print(u.getBirth_year());%>">
    					</div>

    					<div class="form-group login-group-checkbox">
    						<%if (u.getSex().equals("m")) {%>
    						<input type="radio" class="" name="gender" value="m" id="male" placeholder="username" checked="checked">
    						<label for="male">Male</label>
							<input type="radio" class="" name="gender" value="f" id="female" placeholder="username">
    						<label for="female">Female</label>
							<%}else{ %>
							<input type="radio" class="" name="gender" value="m" id="male" placeholder="username">
    						<label for="male">Male</label>
    						<input type="radio" class="" name="gender" value="f" id="female" placeholder="username" checked="checked">
    						<label for="female">Female</label>
    						<%} %>
    					</div>
    				</div>
    				<button type="submit" class="login-button"><img src="arrow.jpg" width=20 height=20></i></button>
    			</div>
    		</form>
    	</div>
    	<!-- end:Main Form -->
    </div>
    <!-- end:register -->
     
    
    
    
    
    
    
        
    <div class="col-lg-3">
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active" align=center>
            <img class="first-slide" src="Harry_Potter_and_the_Deathly_Hallows.jpg" alt="First slide">
            <div class="container">
              <div class="carousel-caption">
                <p><a class="btn btn-lg btn-primary" href="#" role="button">More</a></p>
              </div>
            </div>
          </div>
          <div class="item" align=center>
            <img class="second-slide" src="Memoirs_of_a_Geisha.jpg" alt="Second slide">
            <div class="container">
              <div class="carousel-caption">
                <p><a class="btn btn-lg btn-primary" href="#" role="button">More</a></p>
              </div>
            </div>
          </div>
          <div class="item" align=center>
            <img class="third-slide" src="Allegiant.jpg" alt="Third slide">
            <div class="container">
              <div class="carousel-caption">
                <p><a class="btn btn-lg btn-primary" href="#" role="button">More</a></p>
              </div>
            </div>
          </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div><!-- /.carousel -->



</div>

    </div>
    <div class="col-sm-12" align=center >
      <div class="panel panel-default" style="background-color:grey">
        <table align=center width=60%>
          <tr><td align=center><a href="#">Policy</a><td align=center><a href="#">Contact</a><td align=center><a href="#">Top 250</a>
          </table>
        </div>
      </div>

      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
      <!-- Include all compiled plugins (below), or include individual files as needed -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
    </html>
