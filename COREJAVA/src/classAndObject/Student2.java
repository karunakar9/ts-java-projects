package classAndObject;

public class Student2 {
	private int id;
	private String name;
	private String address;
    static String clgName="engineering college";
    static int idGenerator=1000;
	Student2() {
		this.id=++idGenerator;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
   /* public void Student2 (name,address){
    	this.name=name;
    	this.address=address;
    }*/
	}		
	public void display(){
		System.out.println("id:" + getId());
		System.out.println("name:" + getName());
		System.out.println("address:" + getAddress());
		System.out.println("college name:" + Student1.clgName);
	}
	
}
