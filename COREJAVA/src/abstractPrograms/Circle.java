package abstractPrograms;

public class Circle extends Shape {
	private double radius;
	public static final double pi = 3.14;

	public Circle() {
		super();
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return pi;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}

}
