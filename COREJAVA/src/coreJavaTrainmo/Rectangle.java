package coreJavaTrainmo;
public class Rectangle {
	int id;
	double length;
	double width;

	public double area() {
		double res = length * width;
		return res;
	}

	public double perimeter() {
		double res = 2 * (length * width);
		return res;
	}

	public void display() {
		System.out.println("area:" + area());
		System.out.println("perimeter:" + perimeter());
	}
}