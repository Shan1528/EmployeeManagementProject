package employee.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User Details")
public class DataB {
	@Id
	@GeneratedValue
	private  int userId;
	private String UserName;
	private String Password;
	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public DataB get() {
		
		return null;
	}
	public 	String print() {
		return "Please Enter eight character atleast one Upper Character and one number";
		}
	
	
	
	
	

}
