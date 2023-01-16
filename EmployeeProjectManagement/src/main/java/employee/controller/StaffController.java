package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import employee.entity.Staff;
import employee.repo.StaffRepo;

@Component
public class StaffController implements CommandLineRunner {
	@Autowired
	public StaffRepo sta;

	@Override
	public void run(String... args) throws Exception {
		Staff obj1= new Staff(1,"Vinoth","CSE",2,10000);
		try {
			sta.save(obj1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
