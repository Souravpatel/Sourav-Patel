package co.cg.demo;

public class EmployeeDetails {
	private String FirstName;
	private String LastName;
	private String Dessignation;
	private int age;
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(String firstName, String lastName, String dessignation, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Dessignation = dessignation;
		this.age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDessignation() {
		return Dessignation;
	}
	public void setDessignation(String dessignation) {
		Dessignation = dessignation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
