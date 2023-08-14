package mrahmanashiq.springbootbe.repository;

import mrahmanashiq.springbootbe.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
