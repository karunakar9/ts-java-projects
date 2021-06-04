package ModularProgramming;

import java.util.Scanner;

public class LotteryWith3Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          System.out.println("enter the 3 variables");
          /*You have a green lottery ticket, with integers a, b, and c on it. If the numbers are 
          all different from each other, the result is 0. If all of the numbers are the same, 
          the result is 20. If two of the numbers are the same, the result is 10.*/
          int var1=scan.nextInt();
          int var2=scan.nextInt();
          int var3=scan.nextInt();
          Diff(var1,var2,var3);
          scan.close();
	}
	public static void Diff(int a , int b , int c){
		if (a==b && a==c)
			System.out.println("result is:20");
		if(a != b && b != c && c != a)
			System.out.println("result is : 0");
		if (a==b && c != a)
			System.out.println("result is : 10");
		if (b==c && c != a)
			System.out.println("result is : 10");
		if (a==c && c != a)
			System.out.println("result is : 10");		
	}

}
