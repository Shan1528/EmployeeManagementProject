package employee.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import employee.entity.DataB;
import employee.entity.DateOB;
import employee.repo.User;

@RestController
public class UserValue {
	@Autowired
	User data;

	@PostMapping("/UserData")
	public DataB UserData(@RequestParam("Username") String UserName, @RequestParam("Password") String Password) {
		DataB value = new DataB();
		value.setUserName(UserName);
		value.setDate(new java.util.Date());
		value.setPassword(Password);
		value.getUserId();
		String Password1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8}$";
		Pattern pattern = Pattern.compile(Password1);
		Matcher matcher = pattern.matcher(Password);
		if (matcher.matches() == true) {
			System.out.println("Password  matches pattern : " + matcher.matches());
			data.save(value);
			System.out.println(value);
		} else {
			System.out.println("Please Enter eight character atleast one Upper Character and one number");

		}
		return value;

	}

	@GetMapping("/UserDetails")
	public Object UderDetails() {
		List<DataB> ob = data.findAll();
		return ob;
	}

	@SuppressWarnings("deprecation")
	@DeleteMapping("/DeleteUser/{userId}")
	public String deleteById(@PathVariable int userId) {
		DataB del = data.getOne(userId);
		data.delete(del);
		return "Deleted Successfully";
	}

	@PostMapping("/UpdateData")
	public DataB UserData(@RequestParam("userId") int userId, @RequestParam("Username") String UserName,
			@RequestParam("Password") String Password) {
		System.out.println(userId);
		System.out.println(UserName);
		System.out.println(Password);
		DataB value = data.findById(userId).get();
		value.setUserName(UserName);
		value.setDate(new java.util.Date());
		value.setPassword(Password);
		String Password1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8}$";
		Pattern pattern = Pattern.compile(Password1);
		Matcher matcher = pattern.matcher(Password);
		if (matcher.matches() == true) {
			System.out.println("Password  matches pattern : " + matcher.matches());
			data.save(value);
			System.out.println(value);
		} else {
			System.out.println("Please Enter eight character atleast one Upper Character and one number");
		}
		return value;

	}

//	@DeleteMapping("/DeleteUser")
//	 public String deleteById(@RequestParam("userId")int userId) {
//	data.deleteById(userId);
//	return "Deleted Successfully";
//	        
//	    }

}
