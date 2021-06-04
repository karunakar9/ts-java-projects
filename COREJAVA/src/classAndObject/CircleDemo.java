package classAndObject;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("enter id and radius:");
		c1.id=scan.nextInt();
		c1.radius=scan.nextDouble();
		//c1.display();
		System.out.println("====we can get individual also=====");
		System.out.println(c1.area());
		scan.close();

	}

} 
