package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("mothi", 5000, "volunteer");
		Employee e2 = new Employee("eshwar", 5016, "sachivalayam manager");
		Employee e3 = new Employee("dihith", 30000, "police");
		Employee e4 = new Employee("sameer", 28000, "developer");
		Employee e5 = new Employee("anil", 2500, "postman");
		Employee e6 = new Employee("sanjay", 42345, "software");
		Employee e7 = new Employee("bindu", 12364, "developer");
		Employee e8 = new Employee("mothilal", 60543, "mla");
		Employee e9 = new Employee("sathi", 12345, "actor");
		Employee e10 = new Employee("madhukar", 8765, "Full stack dev");
		List<Employee> list = new ArrayList<>();
		List<Employee> fresherlist = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		
		// Iterator<Employee> itr = list.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }
		// System.out.println("=========delection list============");
		/*
		 * for (Employee e : list) { if (e.getSalary() <= 25000) list.remove(e);
		 * //concurrent exception
		 * 
		 * }
		 */
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.getSalary() <= 25000) {
				itr.remove();
				fresherlist.add(e);
			}
		}

		System.out.println("==========delection list============");
		for (Employee e : list)
			System.out.println(e);

		System.out.println("==========fresher list============");
		for (Employee e : fresherlist)
			System.out.println(e);
		System.out.println("==========fresher list after increment============");
		for (Employee e : fresherlist) {
			e.setSalary(e.getSalary() + 1000);
			System.out.println(e);
		}

	}

}
