package advProg;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the subject marks:");
		int maths = scan.nextInt();
		System.out.println(gradeOfStudent(maths));
	}

	public static String gradeOfStudent(double marks) {
		if (marks >= 80)
			return " A";
		else if (marks >= 60)
			return " B";
		else if (marks >= 50)
			return "C";
		else if (marks >= 45)
			return " D";
		else if (marks >= 25)
			return "E";
		else
			return "F";

	}

}
