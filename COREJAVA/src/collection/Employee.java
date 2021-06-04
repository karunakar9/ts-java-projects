package collection;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String departmnent;
	public static int idGenerator=100;
	public Employee() {
		super();
	}
	public Employee( String name, double salary, String departmnent) {
		super();
		this.id = ++idGenerator;
		this.name = name;
		this.salary = salary;
		this.departmnent = departmnent;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmnent() {
		return departmnent;
	}
	public void setDepartmnent(String departmnent) {
		this.departmnent = departmnent;
	}
	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getDepartmnent()=" + getDepartmnent() + "]";
	}
	

}
