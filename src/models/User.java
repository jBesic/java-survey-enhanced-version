package models;

public class User {
	public static char MALE = 'm';
	public static char FEMALE = 'f';
	
	private String name;
	private String email;
	private char gender;
	private String dob;
	private int status;
	
	public User(String name, String email, char gender, String dob) {
		this.setName(name);
		this.setEmail(email);
		this.setGender(gender);
		this.setDob(dob);
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGener() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getDob() {
		return this.dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
