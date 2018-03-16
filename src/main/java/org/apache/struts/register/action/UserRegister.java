package org.apache.struts.register.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts.register.model.Person;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;

public class UserRegister extends ActionSupport implements SessionAware, ParameterNameAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private String selectedColor;
	private List<String> colors;
	private Boolean subscription;
	private List<String> hobbies;
	private String selectedHobbies;
	private List<Product> products;

	public String execute() throws Exception {

		return SUCCESS;
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
	 * This method is used to reject parameter injection during form personBean.firstName
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

	
	public String initializeFormFields()
	{
		initializeColors();
		initializeHobbies();
		initializeProducts();
		return "input";
	}
	
	public void initializeColors()
	{
		colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
	}
	
	public void initializeHobbies()
	{
		hobbies = new ArrayList<String>();
		hobbies.add("Drawing");
		hobbies.add("Teaching");
		hobbies.add("Singing");
		hobbies.add("Programming");
	}
	
	public void initializeProducts()
	{
		products = new ArrayList<Product>(); 
		products.add(new Product(111,"Mobile Phone",10000));
		products.add(new Product(222,"Camera",7000));
		products.add(new Product(333,"TV",20000));
		products.add(new Product(444,"Laptop",30000));
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Boolean getSubscription() {
		return subscription;
	}

	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getSelectedHobbies() {
		return selectedHobbies;
	}

	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
