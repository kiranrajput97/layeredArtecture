package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServices implements EmployeeInterface{

	public void getEmployeeDetails(Employee obj) {
		// TODO Auto-generated method stub
		obj.setId(123);
		obj.setName("Arun");
		obj.setDesignation("Manager");
		obj.setSalary(40000);
	}

	public void findInsuranceScheme(Employee obj) {
		// TODO Auto-generated method stub
		obj.setInsuranceScheme("Scheme A");
	}

	public void displayDetails(Employee obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
	}
	
}
