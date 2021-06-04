package abstractPrograms;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle [area()=" + area() + ", perimeter()=" + perimeter() + ", toString()=" + super.toString()
				+ "]";
	}

}
