package spring.signup.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.signup.start.model.Employee;
import spring.signup.start.repository.EmpoyeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
    private EmpoyeeRepository empoyeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empoyeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empoyeeRepository.findAll();
	}

}
