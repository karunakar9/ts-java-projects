package trainmoPrograms;

import java.util.Scanner;

public class SumOfNtermsOfNaturalNumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of num :");
	int num = scan.nextInt();
	System.out.println(sumofNterms(num));
	

	}
	public static int sumofNterms(int n){
		int sum=0,i=1;
		while (i<=n){
			sum =sum + i;
			i++;
			
		}
		return sum;
	
	
	}

}
