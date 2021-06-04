package conditionalStatements;

import java.util.Scanner;

public class GreatestOfThreeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		System.out.println(largest(num1, num2, num3) + " is greatest number");
		scan.close();
	}

	public static int largest(int n1, int n2, int n3) {

		if ((n1 > n2) && (n1 > n3))
			return n1;
		else if ((n2 > n3) && (n2 > n1))
			return n2;
		else
			return n3;

	}

}
