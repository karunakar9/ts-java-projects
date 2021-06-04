package classAndObject;

public class Student3Demo {

	public static void main(String[] args) {
		Student3 s1 = new Student3("karunakar", 35, 35, 35);

		System.out.println(s1.toString());
		System.out.println("========================================");
		Student3 s2 = new Student3("reddy", 75, 75, 75);
		System.out.println(s2);
		System.out.println("========================================");
		System.out.println("greatest area:"+Student3.compare(s1,s2));

	}

}
