package ModularProgramming;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the inputs:");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int result = add(num1,num2);
	System.out.println("add of numbers:"+result);
	int res = sub(num1,num2);
	System.out.println("sub of result:"+ res);
	int resu =mul(num1 ,num2);
	System.out.println("mul of result:"+ resu);
	//div(num1 ,num2);
	System.out.println("div of result:"+ div(num1,num2));
	

	scan.close();
	}
	public static int add(int a, int b){
		int result = a+b;
		return result;
		
		
	}
	public static int sub(int a, int b){
		int res=a-b;
		return res;
	}
	public static int mul(int a, int b){
		int mul=a*b;
		return mul;
	}
	public static int div(int a, int b){
		return a/b;
		
	}
}
