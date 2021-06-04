package conditionalStatements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scan.nextInt();
		System.out.println(num + " is even :" + Evenodd(num));
		scan.close();

	}

	public static boolean Evenodd(int a) {
		if (a % 2 == 0)
			return true;
		else
			return false;
	}
}

