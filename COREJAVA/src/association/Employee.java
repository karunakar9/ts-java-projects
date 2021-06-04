package association;

public class Employee {
	private int id;
	private String name;
	private String emaiId;
	private double salary;
	private long phoneNum;
	private Address address;
	public static int idGenerator = 1000;

	public Employee() {
		super();
	}

	public Employee(String name, String emaiId, double salary, long phoneNum, Address address) {
		super();
		this.id = ++idGenerator;
		this.name = name;
		this.emaiId = emaiId;
		this.salary = salary;
		this.phoneNum = phoneNum;
		this.address = address;
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

	public String getEmaiId() {
		return emaiId;
	}

	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Employee.idGenerator = idGenerator;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emaiId=" + emaiId + ", salary=" + salary + ", phoneNum="
				+ phoneNum + ", address=" + address + "]";
	}

}
