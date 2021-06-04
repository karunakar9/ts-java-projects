package exceptionHandling;

public class Voter {
	private int id;
	private String name;
	private int age;
	private String address;
	private long phoneNum;
	public static int idGenerator = 100;

	public Voter() {
		super();
	}

	public Voter(String name, int age, String address, long phoneNum) {
		super();
		this.id = ++idGenerator;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
