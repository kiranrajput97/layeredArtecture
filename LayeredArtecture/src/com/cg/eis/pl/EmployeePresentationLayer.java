package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServices;
import com.cg.eis.service.EmployeeInterface;

public class EmployeePresentationLayer {
	public static void main(String [] abc)
	{
		Employee employee = new Employee();
		EmployeeInterface employeeService = new EmployeeServices();
		employeeService.getEmployeeDetails(employee);
		employeeService.findInsuranceScheme(employee);
		employeeService.displayDetails(employee);
	}

}
