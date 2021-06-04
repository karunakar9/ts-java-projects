package classAndObject;

public class Rectangle1 {
	private int id;
	private int length;
	private int width;

	Rectangle1() {
		System.out.println("default constructor");
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	Rectangle1(int id, int length, int width) {
		this.id = id;
		this.length = length;
		this.width = width;
	}

	Rectangle1(int id, int length) {
		this.id = id;
		this.length = length;
		this.width = width;
	}

	void display() {
		System.out.println("id:" + id);
		System.out.println("length:" + length);
		System.out.println("width:" + width);
	}

}
