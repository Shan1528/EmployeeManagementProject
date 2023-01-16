package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import employee.entity.Employee;
import employee.repo.EmpRepo;

@Component
public class EmpController implements CommandLineRunner{
    @Autowired
	public EmpRepo emprepo;

	
	@Override
	public void run(String... args) throws Exception {
		
		Employee ob = new Employee(2, "vel", "vmshan@gmail.com", "shanvel", "India", 2);
		try {
			emprepo.save(ob);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
