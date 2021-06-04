package loopsPrograms;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		// Prime number or not
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input:");
	       int num = scan.nextInt();
	       System.out.println("given "+num+" is prime :"+isprime(num));

	       scan.close();
	}
	public static boolean isprime(int n){
		int count=0,i;
		for(i=1;i<=n;i++){
			if(n % i==0)
				count++;
		}
		if(count==2)
			return true;
		else 
			return false;
	}
	

}
