import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job //Employee bean or class
{
	@Id
	private int id;
	private String fname;
	private String lname;
	private String department;
	private double salary;
	
	public void setId(int id){
		this.id=id;
	}
	public void setFname(String fname){
		this.fname=fname;
	}
	public void setLname(String lname){
		this.lname=lname;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public int getId(){
		return id;
	}
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}
	public String getDepartment(){
		return department;
	}
	public double getSalary(){
		return salary;
	}
	

}
