package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

public class User {

	private String user;
	private String password;
	private String userName;
	
	private Person persion;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Person getPersion() {
		return persion;
	}

	public void setPersion(Person persion) {
		this.persion = persion;
	}

}