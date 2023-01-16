package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import employee.controller.EmpController;
import employee.controller.StaffController;
import employee.entity.Employee;
import employee.entity.Staff;

@SpringBootApplication
public class EmployeeProjectManagementApplication {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context=SpringApplication.run(EmployeeProjectManagementApplication.class, args);
		EmpController rep=context.getBean(EmpController.class);
		rep.run();
		StaffController rep2=context.getBean(StaffController.class);
		rep2.run();
		
	}

}
