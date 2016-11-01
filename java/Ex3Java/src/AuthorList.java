import java.util.*;
public class AuthorList {
private ArrayList<Author> authors;
AuthorList(){
	this.authors = new ArrayList<>();
}

AuthorList(Author[] authors){
	this();
	for (Author a:authors)
		this.addAnAuthor(a);
	}

public ArrayList<Author> getAuthors() {return authors;}
public void setAuthors(ArrayList<Author> authors) {this.authors = authors;}

public void addAnAuthor(Author author){this.authors.add(author);}
public void removeAuthor(Author author){this.authors.remove(author);}

public void printTheNumberOfAuthors(){
	System.out.println(this.authors.size());
} 

public Author findAnAuthor(Author author){
	for (Author a : this.authors)
		if (a.getName().equals(author.getName()))
			return a;
	return null;
}
public boolean searchAuthor(Author author){
	for (Author a: this.authors)
		if (a.getName().equals(author.getName()))
			return true;
	return false;
}
	
}

