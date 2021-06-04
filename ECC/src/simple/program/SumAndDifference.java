package simple.program;

import java.util.Scanner;

public class SumAndDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input");
		int value = scan.nextInt();
		int num1 = value / 10;
		int num2 = value % 10;
		int sum = num1 + num2;
		int diff = num1 - num2;
		System.out.println("num1:" + num1 + "\nnum2 :"+num2+"\nsum:" + sum + "\ndiff:" + diff);
		scan.close();
	}

}
