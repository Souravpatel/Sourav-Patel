package co.cg.demo.main;

import co.cg.demo.EmployeeDetails;

public class MainClass {
	public static void amain(String[] args) {
		EmployeeDetails emp = new EmployeeDetails("Howard","Stark","Founder",45);
		System.out.println("EMPLOYEE DETAILS:\n 1. NAME "+emp.getFirstName()+emp.getLastName()+"\n 2. DESIGNATION: "+emp.getDessignation()+"\n 3. AGE: "+emp.getAge());
	}
}
