package conditionalStatements;

import java.util.Scanner;

public class GivenNumberIs5DigitOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scan.nextInt();
		FiveDigitOrNot(num);
		//System.out.println(num + " is five digit:" + FiveDigitOrNot(num));
		scan.close();
	}

	public static void /*boolean*/ FiveDigitOrNot(int a) {
		if (a > 9999 && a <= 99999)
		//return true;
			System.out.println("given number is 5 digit number");
		else
			//return false;
			System.out.println("given num is not 5 digit");
           
	}

}
