package differentPrograms;

import java.util.Scanner;

public class SecondMaxNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		digit(num);
		scan.close();
	}
		

	public static void digit(int numb) {
		int max1 = 0, max2 = 0;
		while (numb > 0) {
			int digit = numb % 10;
			if (max1 < digit) {
				max2 = max1;
				max1 = digit;
			} else if (max2 < digit && max1 != digit) {
				max2 = digit;
			}
			numb = numb / 10;
		}
		System.out.println("max1: " + max1);
		System.out.println("max2: " + max2);
	}

}
