package br.com.seasoft;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.seasoft.dto.Employee;
import br.com.seasoft.repo.EmployeeRepository;

@SpringBootTest
class PersistenceTesteApplicationTests {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void saveEmployee() {
		Employee e = new Employee();
		e.setName("foka");
		e.setAge(38);
		
		employeeRepository.save(e);
	}
	
	@Test
	void listEmployee() {
		List<Employee> list = employeeRepository.findAll();
		for (Employee employee : list) {
			System.out.println(employee.getName());
		}
	}

}
