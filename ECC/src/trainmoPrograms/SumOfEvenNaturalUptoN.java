package trainmoPrograms;

import java.util.Scanner;

// WAP to print the sum of even natural numbers upto 'n'. (28 aug 2019)
public class SumOfEvenNaturalUptoN {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i=0,sum=0;
		while(num>= i){		
			if(i % 2 ==0)
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		scan.close();
	}
	

}
