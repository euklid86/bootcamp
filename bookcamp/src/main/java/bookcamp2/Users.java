package bookcamp2;

public class Users {
	private String username;
	private String password;
	private int userid;
	private String name;
	private String surname;
	private int birth_year;
	private String sex;

	public Users() {
	}
	
	public Users(int userid, String username, String password, String name, String surname, int birth_year, String sex) {
		this.username = username;
		this.password = password;
		this.userid = userid;
		this.name = name;
		this.surname = surname;
		this.birth_year = birth_year;
		this.sex = sex;
	}
	
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username = username;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public int getUserid() {return userid;}
	public void setUserid(int userid) {this.userid = userid;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	public int getBirth_year() {return birth_year;}
	public void setBirt_year(int age) {this.birth_year = birth_year;}
	public String getSex() {return sex;}
	public void setSex(String sex) {this.sex = sex;}
	
}
