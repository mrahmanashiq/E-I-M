package mrahmanashiq.springbootbe;

import mrahmanashiq.springbootbe.entity.Employee;
import mrahmanashiq.springbootbe.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBeApplication.class, args);
    }

    private final EmployeeRepository employeeRepository;

    @Autowired
    public SpringbootBeApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("John")
                .lastName("Doe")
                .email("jhon@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Jane")
                .lastName("Doe")
                .email("jane@gmail.com")
                .build();

        employeeRepository.save(employee1);
		employeeRepository.save(employee2);
    }
}
