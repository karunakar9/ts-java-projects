package interfacePrograms;

import java.util.Scanner;

public class calBillAmount {

	public static void main(String[] args) {
		int choice = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("1.Water");
		System.out.println("2.electricity bill");
		System.out.println("3.exit");
		System.out.println("enter choice:");
		choice = Scan.nextInt();

		if (choice == 1) {
			System.out.println("enter the inputs of water:");
			WaterBill w = new WaterBill();
			double chargePerLtr = Scan.nextDouble();
			w.setChargePerLtr(chargePerLtr);
			int noOfltrsUsed = Scan.nextInt();
			w.setNoOfltrsUsed(noOfltrsUsed);
			w.displayBill();
		} else if (choice == 2) {

			System.out.println("enter the elctricity inputs:");
			ElectricityBill E = new ElectricityBill();
			double noOfUnitsUsed = Scan.nextDouble();
			E.setNoOfUnitsUsed(noOfUnitsUsed);
			double chargePerUnit = Scan.nextDouble();
			E.setChargePerUnit(chargePerUnit);
			E.displayBill();
		} else
			System.out.println("invalid input given by eshwar");

	}

}
