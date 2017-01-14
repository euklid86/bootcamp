package bookcamp2;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class BookDAO {

private Connection con = null;
	
	public BookDAO(){}
	
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
		

	public List<Book> getBooks() throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "SELECT * FROM bookcamp.book;";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			ResultSet rs = stmt1.executeQuery();

			List<Book> bookList = new ArrayList<Book>();
						
			while(rs.next()) {
				int bookId = rs.getInt("book_id");
				String isbn = rs.getString("isbn");
				String imagePath = rs.getString("image");
				String title = rs.getString("title");
				int authorId = rs.getInt("author_id");
				Author author = this.getAuthor(authorId);
				String category = rs.getString("category");
				String publisher = rs.getString("publisher");
				int publicationYear = rs.getInt("publication_year");
				String description = rs.getString("description");

				// Fill booklist
				bookList.add(new Book(bookId, isbn, imagePath, title, author, category, publisher, publicationYear,
						description));
				
			}

			rs.close();
			stmt1.close();
			
			return bookList;

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting users from database: " + e.getMessage());
		}
		
	}//End of getStudents	
	/*
	 * You must complete the code
	 */
	
	public List<Book> findWihlist(int userId) throws Exception{
		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "select user.username, book.* from bookcamp.book Inner join bookcamp.wishlist on book.book_id = wishlist.book_id inner join bookcamp.user on user.user_id = wishlist.user_id where user.user_id="+userId+";";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			ResultSet rs = stmt1.executeQuery();

			List<Book> bookList = new ArrayList<Book>();
						
			while(rs.next()) {
				int bookId = rs.getInt("book_id");
				String isbn = rs.getString("isbn");
				String imagePath = rs.getString("image");
				String title = rs.getString("title");
				int authorId = rs.getInt("author_id");
				Author author = this.getAuthor(authorId);
				String category = rs.getString("category");
				String publisher = rs.getString("publisher");
				int publicationYear = rs.getInt("publication_year");
				String description = rs.getString("description");

				// Fill booklist
				bookList.add(new Book(bookId, isbn, imagePath, title, author, category, publisher, publicationYear,
						description));
				
			}

			rs.close();
			stmt1.close();
			
			return bookList;

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting books from database: " + e.getMessage());
		}
	}
	
	public Book findBookByTittle(String tittle) throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			Book book = null;
			
			for (Book s: this.getBooks())
		  		if (s.getTitle().equals(tittle))
		  				book=s;
			
			return book;

		} catch (Exception e) {
			
			throw new Exception("An error occured while searching for book in the database: " + e.getMessage());
		}
		
	}//End of getBooks
	
	public Author getAuthor(int authorId) {
		try {
			for (Author author : this.getAllAuthors()){
				if (author.getAuthorId() == authorId){
					return author;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Author> getAllAuthors() throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
			
			String sqlquery= "SELECT * FROM author;";
			
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			ResultSet rs = stmt1.executeQuery();

			List<Author> authorlist = new ArrayList<>();
						
			while(rs.next()) {
				
				// Retrieve by column name
				int authorId = rs.getInt("author_id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String imagePath = rs.getString("image");
				String bio = rs.getString("bio");
				// Fill authorlist
				authorlist.add(new Author(authorId, name, surname, imagePath, bio));
				
			}

			rs.close();
			stmt1.close();
			
			return authorlist;

		} catch (Exception e) {
			
			throw new Exception("An error occured while getting ratings from database: " + e.getMessage());
		}
		
	}
	
}//End of class
