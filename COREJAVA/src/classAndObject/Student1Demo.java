package classAndObject;

import java.util.Scanner;

public class Student1Demo {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		//s1.id = 123;//private cannot be accessed directly
		//s1.name = "reddy";
		//s1.address = "asdfgh asdfg sdfg";
		

  	 Scanner scan = new Scanner(System.in);
   	 System.out.println("enter id:");
   	 int id=scan.nextInt();
   	 System.out.println("enter name:");
   	 String name=scan.next();
   	 System.out.println("enter address:");
   	 String address=scan.next();
   	s1.setId(id);
	s1.setName(name);
	s1.setAddress(address);
	
	System.out.println("id:" + s1.getId());
	System.out.println("name:" + s1.getName());
	System.out.println("address:" + s1.getAddress());
    System.out.println("college name:"+Student1.clgName);
		
	}

}
