package org.apache.struts.register.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts.register.exceptions.SecurityBreachException;
import org.apache.struts.register.model.Person;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;

public class Register extends ActionSupport implements SessionAware, ParameterNameAware {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	private Map<String, Object> session;

	public String execute() throws Exception {

		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

	public String init() throws Exception {
		session.put("valid", true);
		session.put("user", new User());
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * This method is used to reject parameter injection during form
	 * personBean.firstName
	 * 
	 */
	@Override
	public boolean acceptableParameterName(String parameterName) {

		System.out.println("acceptableParameterName  called : " + parameterName);
		boolean allowedParameterName = true;

		if (parameterName.contains("session") || parameterName.contains("request")) {

			allowedParameterName = false;

		}

		return allowedParameterName;
	}

	public void validate() {
		if (getPersonBean() != null && "".equals(getPersonBean().getFirstName())) {
			addFieldError("username", getText("username.required"));
		}
	}

	public Map<String, Object> getSession() {
		return session;
	}
	
	

	public void throwException() throws Exception {

		throw new Exception("Exception thrown from throwException");

	}

	public void throwNullPointerException() throws NullPointerException {

		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

	public void throwSecurityException() throws SecurityBreachException {

		throw new SecurityBreachException(
				"Security breach exception thrown from throwSecurityException");
	}


}
