package ModularProgramming;

import java.util.Scanner;

public class GradingOfStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maths = scan.nextInt();
		int physics = scan.nextInt();
		int chemistry = scan.nextInt();
		double perc = percentageOfStudent(maths, physics, chemistry);
		System.out.println(gradeOfStudent(perc));

	}

	public static double percentageOfStudent(int math, int phy, int che) {

		double total = (math + phy + che) / 300.0;
		double percentage = total * 100;
		return percentage;

	}

	public static String gradeOfStudent(double perc) {
		if (perc >= 90)
			return" A";
					
		else if (perc >= 70 )
			return " B";
		else if (perc >= 50 )
			return "C";
		else
			return " F";

	}

}
