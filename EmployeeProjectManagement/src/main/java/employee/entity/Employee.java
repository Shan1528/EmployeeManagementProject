package employee.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp Table")
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;
	private String username;
	private String password;
	private int batch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email, String username, String password, int batch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.batch = batch;
	}


}