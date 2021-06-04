package interfacePrograms;

public class Circle implements Shape {
	private double radius;
	private int id;
	public static int idGenerator = 1000;

	public Circle() {

		super();
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
		this.id = ++idGenerator;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Circle.idGenerator = idGenerator;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

	@Override
	public String toString() {
		return "Circle [getId()=" + getId() + ", calArea()=" + calArea() + ", calPerimeter()=" + calPerimeter() + "]";
	}

}
