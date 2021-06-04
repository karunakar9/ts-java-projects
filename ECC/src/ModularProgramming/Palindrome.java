package ModularProgramming;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  r ,temp, sum=0 ;
		System.out.println("enter the number");
       Scanner scan = new Scanner(System.in);
       int num1 = scan.nextInt();
       temp=num1;
        while(num1>0){
        r=num1 % 10;
        sum=sum*10 + r ;
        num1 = num1 /10 ;
        }
       if (temp == sum){
    	   System.out.println("given number "+temp+" is palindrome ");
       }
       else{
    	   System.out.println("given number "+temp+" is not palindrome ");
       }
       scan.close();
		
	}

}
