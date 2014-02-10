
public class RegisteredUser {
 protected String name;
 protected String lastName;
 protected String industry;
 protected String email;
 protected String password;
 protected String university;
 
 
 public String getEmail() {
	return email;
}

public String getUniversity() {
	return university;
}

public void setUniversity(String university) {
	this.university = university;
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

public RegisteredUser(){
	 
 }
 
 public void setName(String n){
	 name=n;
 }
 
 public void setLastName(String n){
	 lastName=n;
 }

public String getIndustry() {
	return industry;
}

public void setIndustry(String industry) {
	this.industry = industry;
}

public String getName() {
	return name;
}

public String getLastName() {
	return lastName;
}
 
 
 
}
