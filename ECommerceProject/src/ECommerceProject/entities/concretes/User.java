package ECommerceProject.entities.concretes;

import ECommerceProject.entities.abstracts.Entity;

public class User implements Entity {

	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
    private boolean verified;
    
public User() {}
    
public User(int id, String firstname, String lastname, String email, String password, boolean verified) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.verified = verified;
	}


 public int getId() {
	return id;
}
 public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}

	
	
	
	
	
}
