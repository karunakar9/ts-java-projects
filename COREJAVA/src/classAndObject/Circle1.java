package classAndObject;

public class Circle1 {
	private int id;
	private double radius;

	Circle1() {
		System.out.println("default constructor");
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double area() {
		return 2 * 3.14 * radius;
	}

	public double perimeter() {
		return 2 * 3.14 * radius;
	}

	public void display() {
		System.out.println("id:" +id);
		System.out.println("radius:" + radius);
		System.out.println("area:" + area());
		System.out.println("perimeter:" + perimeter());

	}

}
