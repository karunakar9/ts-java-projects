package loopsPrograms;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// factorial of a number
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input:");
		int num = scan.nextInt();
		System.out.println("factorial of a given number is :" + Factorial(num));
		scan.close();
	}

	public static int Factorial(int n) {
		int fact = 1, i;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
