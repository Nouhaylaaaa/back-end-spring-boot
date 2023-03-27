package spring.signup.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.signup.start.model.Employee;
@Repository
public interface EmpoyeeRepository extends JpaRepository<Employee, Integer> {

}
