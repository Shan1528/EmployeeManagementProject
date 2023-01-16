package employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Staff Table")
public class Staff {
     @Id
     private int id;
	private String Name;
	private String Department;
	private int Experience;
	private int Salary;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Staff() {
		super();
		
	}
	public Staff(int id, String name, String department, int experience, int salary) {
		super();
		this.id = id;
		Name = name;
		Department = department;
		Experience = experience;
		Salary = salary;
	}
	
	
}
