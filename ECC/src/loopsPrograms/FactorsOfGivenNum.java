package loopsPrograms;

import java.util.Scanner;

public class FactorsOfGivenNum {
	public static void main(String[] args) {
		// factors of given number
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input:");
		int num = scan.nextInt();
		factors(num);
		scan.close();

	}

	public static void factors(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println( i);

		}

	}
}
