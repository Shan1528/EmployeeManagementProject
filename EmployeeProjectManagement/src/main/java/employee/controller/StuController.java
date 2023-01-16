package employee.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import employee.entity.DateOB;

import employee.repo.StuRepo;

@RestController
public class StuController {
	@Autowired
	StuRepo stu;
	@PostMapping("/Stud")
//public DateOB Hell(@RequestBody DateOB emp) {
//DateOB value = new DateOB();
//value.setId(emp.getId());
//value.setName(emp.getName());
//value.setEmail(emp.getEmail());
//value.setDoB(emp.getDoB());
//value.setDate(null);
//stu.save(value);
//return value;
public DateOB Stud(@RequestParam("Id")int id,@RequestParam ("Name")String name, @RequestParam ("Email")String email,@RequestParam ("DOB")String DoB) {
	DateOB data=new DateOB();
	data.setId(id);
	data.setName(name);
	data.setEmail(email);
	data.setDoB(DoB);
	java.util.Date date = null;
	data.setDate(new java.util.Date());
	stu.save(data);
	return data;
	
}
	@GetMapping("/getvalue")
	public Object getvalue() {
		java.util.List<DateOB> value=stu.findAll();
		return value;
		}
	@DeleteMapping("/delete")
 public String deleteById(@RequestParam("Id")int id) {
stu.deleteById(id);
return "Deleted Successfully";
        
    }
	@PostMapping("/Update")
	public DateOB Update(@RequestParam("Id")int id,@RequestParam ("Name")String name, @RequestParam ("Email")String email,@RequestParam ("DOB")String DoB) {
		DateOB data=stu.findById(id).get();
		data.setName(name);
		data.setEmail(email);
		data.setDoB(DoB);
		java.util.Date date = null;
		data.setDate(new java.util.Date());
		stu.save(data);
		return data;
	}
}
