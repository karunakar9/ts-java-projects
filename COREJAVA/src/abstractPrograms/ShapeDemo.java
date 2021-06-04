package abstractPrograms;

import java.awt.font.ShapeGraphicAttribute;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("red", true, 2.0);
		System.out.println(s1.toString());
		Shape s2 = new Rectangle("pink", true, 2.0, 2.0);
		System.out.println(s2.toString());

	}

}
