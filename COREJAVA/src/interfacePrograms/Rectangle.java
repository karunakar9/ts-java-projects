package interfacePrograms;

public class Rectangle implements Shape {
	private double length;
	private double width;
	private int id;
	public static int idGenerator=1000;
	 
	public Rectangle() {
		super();
	}
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.id=++idGenerator;
	}
	


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}
	


	public int getId() {
		return id;
	}


	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}


	@Override
	public String toString() {
		return "Rectangle [getId()=" + getId() + ", calArea()=" + calArea() + ", calPerimeter()=" + calPerimeter()
				+ "]";
	}
	
	

}
