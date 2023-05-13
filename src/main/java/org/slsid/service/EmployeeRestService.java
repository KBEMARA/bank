package org.slsid.service;

import java.util.List;

import org.slsid.entities.Employee;
import org.slsid.metier.EmployeeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRestService {
	
	@Autowired
	private EmployeeMetier employeeMetier;
    
	@RequestMapping(value="/employees",method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee e) {
		return employeeMetier.saveEmployee(e);
	}
	@RequestMapping(value="/employees",method = RequestMethod.GET)
	public List<Employee> listEmployees() {
		return employeeMetier.listEmployees();
	}
	
	
	

}
