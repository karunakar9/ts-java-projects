package classAndObject;

public class TriangleDemo {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(40, 50, 60);
		System.out.println(t1.toString());
		
		Triangle t2 = new Triangle(4, 5, 6);
		System.out.println(t2.toString());
	   System.out.println("greatest area:"+Triangle.compare(t1,t2));
		//Triangle obj =new Triangle.compare(t1,t2);

	}

}
