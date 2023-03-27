package spring.signup.start.service;

import java.util.List;

import spring.signup.start.model.Employee;

public interface EmployeeService {
 public Employee saveEmployee(Employee employee);
 public List<Employee> getAllEmployee();
}
