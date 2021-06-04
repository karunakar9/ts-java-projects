package ModularProgramming;

import java.util.Scanner;

public class DiscountingSlabs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input: ");
		double amount = scan.nextInt();
		System.out.println("selling price : " + discountingSlab10(amount));

	}

	public static double discountingSlab10(double amt) {
		double sellingPrice = 0;

		if (amt <= 10000)
			sellingPrice = amt * 0.9;
		else if (amt <= 20000)
			sellingPrice = amt * 0.8;
		else
			sellingPrice = amt * 0.75;

		return sellingPrice;

	}

}
