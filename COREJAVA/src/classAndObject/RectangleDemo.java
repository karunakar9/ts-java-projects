package classAndObject;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1 = new Rectangle();
		System.out.println("==================");
		Rectangle obj2 = new Rectangle(1,2,3);
		obj2.display();
		System.out.println("==================");
		Rectangle obj3 = new Rectangle(1,2);
        obj3.display();
	}

}
