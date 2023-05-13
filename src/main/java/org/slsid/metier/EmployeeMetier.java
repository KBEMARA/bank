package org.slsid.metier;

import java.util.List;

import org.slsid.entities.Employee;

public interface EmployeeMetier {
	
	public Employee saveEmployee(Employee e);
	public List<Employee> listEmployees();

}
