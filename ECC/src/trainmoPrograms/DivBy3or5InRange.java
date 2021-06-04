package trainmoPrograms;

import java.util.Scanner;

public class DivBy3or5InRange {

	public static void main(String[] args) {
		// In a given range of numbers, find the sum of all the numbers that are divisible by 3 or 5. 
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(divisibleBy(start ,end));
		
	}
	public static int divisibleBy(int st , int end){
		     int i,sum=0;
		     while (st < end){
		    	 if(st % 3 ==0 || st % 5 ==0)
		    		 sum = sum + st;
		            st++;
		     }
		     return sum;
	}
	
	

}
