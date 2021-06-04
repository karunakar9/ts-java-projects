package ModularProgramming;

import java.util.Scanner;

public class Fibonacci_NthTerm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(getNthTermOfFibonacciSeries(15));
		scan.close();
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		// ADD YOUR CODE HERE
		int a, b, c, i;
		int n = nthTerm;
		a = 0;
		b = 1;
		if (n <= 0)
			return -1;
		for (i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;

	}

}
