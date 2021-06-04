package classAndObject;

public class Rectangle {
	int id;
	int length;
	int width;

	Rectangle() {
		System.out.println("default constructor");
	}

	Rectangle(int id, int length, int width) {
		this.id = id;
		this.length = length;
		this.width = width;
	}

	Rectangle(int id, int length) {
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