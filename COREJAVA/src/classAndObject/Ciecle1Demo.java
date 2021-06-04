package classAndObject;

public class Ciecle1Demo {

	public static void main(String[] args) {
		Circle1 obj = new Circle1();
		obj.setId(1);
		obj.setRadius(2);
		System.out.println(obj.getId());
		System.out.println(obj.getRadius());
		obj.display();

	}

}
