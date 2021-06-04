package trainmoPrograms;

import java.util.Scanner;

public class GymTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = scan.nextInt();
		System.out.println(num+" value is : " +gymTime(num));
	}

	public static int gymTime(int n) {
		int i, a = 1, b = 2, c = 3, d = 0;
		for (i = 4; i <= n; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;

	}

}
