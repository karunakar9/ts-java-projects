package simple.program;
import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers as an input ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("sum of the numbers is " +sum);
		  System.out.println("enter the numbers as an input ");
		  int num3=scan.nextInt();
		  int num4=scan.nextInt();
		  int sub=num3-num4;
		  System.out.println("sub of the numbers is " +sub);
		    System.out.println("enter the numbers as an input ");
		    int num5=scan.nextInt();
		    int num6=scan.nextInt();
		    int div=num5/num6;
		    System.out.println("div of the numbers is " +div);
		    System.out.println("enter the numbers as an input ");
		    int num7=scan.nextInt();
		    int num8=scan.nextInt();
		    int mul=num7*num8;
		    System.out.println("div of the numbers is " +mul);
		    scan.close();
	
		

	}

}
