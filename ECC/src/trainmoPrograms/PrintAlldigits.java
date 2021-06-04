package trainmoPrograms;

import java.util.Scanner;

public class PrintAlldigits {

	public static void main(String[] args) {
		// WAP to print all the digits of a given number. (28 aug 2019)
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num>0){
		int	digit=num%10;
		System.out.println(digit);
		num=num/10;
		}

	}

}
