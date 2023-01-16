package employee.controller;



import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.datatype.jsr310.ser.MonthDaySerializer;


import employee.entity.Postm;
import employee.repo.PostRepo;

@RestController
public class Postman {
	@Autowired
	PostRepo re;
	
//	@PostMapping("/hello")
//	public Postm Hello(@RequestBody Postm emp) {
//		Postm value = new Postm();
//		value.setId(emp.getId());
//		value.setName(emp.getName());
//		value.setDep(emp.getDep());
//		Date da=new Date();
//		value.setDate(da);
//		value.setDay(da.getDay());
//		System.out.println(da.getDay());
//		re.save(value);
//		
//		
//		
//		return value;
	@SuppressWarnings("deprecation")
	@PostMapping("/hello")
	public Postm Hello(@RequestParam("Id")int id,@RequestParam ("Name")String name, @RequestParam ("Department")String dep) {
		Postm value = new Postm();
		value.setId(id);
		value.setName(name);
		value.setDep(dep);
		Date da=new Date();
		value.setDate(da);
		value.setDay(da.getDay());
		System.out.println(da.getDay());
		re.save(value);
		return value;
		
	}
	@GetMapping("/user")
	public Object user() {
	List<Postm> obj=re.findAll();
	return obj;
	
		
	}

	
}
