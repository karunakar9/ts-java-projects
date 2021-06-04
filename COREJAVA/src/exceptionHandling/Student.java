package exceptionHandling;

public class Student {
	private int id;
	private String name;
	private String Branch;
	public static int idGenerator=100;
	public Student() {
		super();
	}
	public Student(String name, String branch) {
		super();
		this.id=++idGenerator;
		this.name = name;
		Branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Branch=" + Branch + "]";
	}
	
	

}
