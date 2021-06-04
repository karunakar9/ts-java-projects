package loopsPrograms;

import java.util.Scanner;

public class SumofNaturalNumsWithForloop {

	public static void main(String[] args) {
		// sum of first n natural numbers using for loop
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the n valueZ	 :");
       int numrange = scan.nextInt();
       System.out.println("sum of n natural numbers is : " +sum(numrange));
       scan.close();
	}
       public static int sum(int numrange){
       int sum=0,i;
       for (i=1;i<=numrange;i++){
    	   sum = sum + i ;
    	   
       }
       return sum;
	
       }
}
