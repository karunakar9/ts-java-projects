package ModularProgramming;

import java.util.Scanner;

public class AvgOfThreeInputNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the three inputs:");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		System.out.println("avg of 3 input numbers:"+avg(num1,num2,num3));
		scan.close();
	}
	public static double avg(double a,double b,double c){
		return (a+b+c)/3;
	}

}
