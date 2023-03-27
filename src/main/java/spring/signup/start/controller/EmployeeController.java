package spring.signup.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.signup.start.model.Employee;
import spring.signup.start.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/add")
    public String add(@RequestBody Employee employee)
    { 
		employeeService.saveEmployee(employee);
		return "New Employee is added ";
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmployes()
	{
		return employeeService.getAllEmployee();
	}
}
