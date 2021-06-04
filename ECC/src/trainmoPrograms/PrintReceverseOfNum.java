package trainmoPrograms;

import java.util.Scanner;

public class PrintReceverseOfNum {

	public static void main(String[] args) {
		// WAP to reverse a given integer and print both the given number and the reverse number 
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the input:");
       int num = scan.nextInt();
       System.out.println("given number :"+num);
       int sum=0;
       while(num > 0){
    	 int  digit=num%10;
    	   sum=sum*10+digit;
    	   num = num/10;
       }
       System.out.println("reverse number is:"+sum);
	}

}
