package conditionalStatements;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the year:");
	int year = scan.nextInt();
	Leapyear(year);
	}
	public static void Leapyear(int yr){
		if (yr % 400 == 0){
			System.out.println("century leap year");
		}
			else if (yr %4==0 && yr %100 != 0)
				System.out.println("non century leap year");
			else 
				System.out.println("not a leap year");
		}
	}


