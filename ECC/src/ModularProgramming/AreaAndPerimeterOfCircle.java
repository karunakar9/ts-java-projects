package ModularProgramming;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input of radius:");
		double r=scan.nextDouble();
		System.out.println("area of a circle:"+area(r));
		System.out.println("perimeter of a circle:"+perimeter(r));
		scan.close();
	}
	public static double area( double a){
		return 3.14*a*a;
	}
	public static double perimeter(double b){
		return 2*3.14*b;
	}

}
