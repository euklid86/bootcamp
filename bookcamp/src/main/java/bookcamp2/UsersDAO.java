package bookcamp2;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class UsersDAO {
		
	private Connection con = null;
	
	public UsersDAO(){}
	
	public void open() throws SQLException {
		try {
			// dynamically load the driver's class file into memory
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			
			throw new SQLException("MySQL Driver error: " + e.getMessage());
		}

		try {
			// establish a connection with the database and creates a Connection
			// object (con)
			con = DriverManager.getConnection("jdbc:mysql://localhost/bookcamp", "root", "1111");
		} catch (Exception e) {
			con = null;
			// throw SQLException if a database access error occurs
			throw new SQLException("Could not establish connection with the Database Server: " + e.getMessage());
		}

	} // End of open

	public void close() throws SQLException {
		try {
			// if connection is open
			if (con != null)
				con.close(); // close the connection to the database to end database session			

		} catch (Exception e3) {
			
			throw new SQLException("Could not close connection with the Database Server: " + e3.getMessage());
		}

	}// end of close
	
	public void updateUser(int user_id, String username, String password, String name, String surname, int birth, String sex) throws Exception{
		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "UPDATE user SET username='"+username+"',password='"+password+"',name='"+name+"', surname='"+surname+"',birth_year="+birth+",sex='"+sex+"' WHERE user_id="+user_id+";";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			stmt1.executeUpdate();
			stmt1.close();

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting users from database: " + e.getMessage());
		}
	}
	
	
	public void removeUser(int user_id)throws Exception{
		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "DELETE FROM wishlist WHERE user_id="+user_id+";";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			
			stmt1.executeUpdate();
			
			sqlquery= "DELETE FROM rating WHERE user_id="+user_id+";";
			stmt1 = con.prepareStatement(sqlquery);
			
			stmt1.executeUpdate();
			
			sqlquery= "DELETE FROM user WHERE user_id="+user_id+";";
			stmt1 = con.prepareStatement(sqlquery);
			
			stmt1.executeUpdate();
			
			stmt1.close();

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting users from database: " + e.getMessage());
		}
		
	}//remove user
	public List<Users> getUsers() throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "SELECT * FROM bookcamp.user;";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			ResultSet rs = stmt1.executeQuery();

			List<Users> userList = new ArrayList<Users>();
						
			while(rs.next()) {
								
				userList.add( new Users(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getString("name"), rs.getString("surname"),rs.getInt("birth_year"), rs.getString("sex"))) ;
				
			}

			rs.close();
			stmt1.close();
			
			return userList;

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting users from database: " + e.getMessage());
		}
		
	}//End of getUser

	public void registerUser(Users user) throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sql= "INSERT INTO  bookcamp.user (username, password, name, surname, birth_year, sex) VALUES (?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString( 1, user.getUsername() );
			stmt.setString( 2, user.getPassword() );
			stmt.setString( 3, user.getName());
			stmt.setString( 4, user.getSurname());
			stmt.setInt( 5, user.getBirth_year());
			stmt.setString( 6, user.getSex());
			
			stmt.executeUpdate();			
			
			stmt.close();	
			

		} catch (SQLException e) {
			
			throw new Exception("User with Username: " + user.getUsername() + " already exists");
			
		} catch (Exception e) {
			
			throw new Exception("An error occured while inserting user to database: " + e.getMessage());
		}
		
	}//End of registerUser
	
	public Users findUserByUsername(String username) throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			Users user = null;
			
			for (Users s: this.getUsers())
		  		if (s.getUsername().equals(username))
		  				user=s;
			
			return user;

		} catch (Exception e) {
			
			throw new Exception("An error occured while searching for student in the database: " + e.getMessage());
		}
		
	}//End of getStudents
	
	
}//End of class