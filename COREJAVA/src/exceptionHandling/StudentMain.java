package exceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("mothilal", "cse"));
		studentList.add(new Student("eshwar", "mech"));
		studentList.add(new Student("madhukar", "cse"));
		studentList.add(new Student("anil", "cse"));
		studentList.add(new Student("dihith", "cse"));
		studentList.add(new Student("sameer", "ece"));
		studentList.add(new Student("karunakar", "eee"));
		Scanner scan = new Scanner(System.in);
		//scan.close();
		int id = scan.nextInt();
		int flag = 0;
		Student temp = null;
		for (Student s : studentList) {
			flag = validateId(s, id);
		}
		try {
			if (flag == 1) {
				System.out.println("found");
			} else {
				throw new StudentNotFoundException("not found");

			}
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int validateId(Student s, int id) {
		if (s.getId() == id)
			return 1;
		else
			return 0;

	}

}
