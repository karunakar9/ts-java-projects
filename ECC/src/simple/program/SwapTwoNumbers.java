package simple.program;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number1\t:");
		int num1=scan.nextInt();
		System.out.println("enter number2\t:");
		int num2=scan.nextInt();
		System.out.println("num1 before swap\t:"+num1);
		System.out.println("num2 before swap\t:"+num2);
		int temp=num1;
		num1=num2;
	    num2=temp;
	    System.out.println("num1 after swap\t:"+num1+"\nnum2 after swap\t:"+num2);
		scan.close();

	}

}
