package classAndObject;

public class Circle {
 int id;
 double radius;
 public double area(){
	double res= (3.14*radius*radius);
	return res;
 }
 public double perimeter(){
	 double res= (2*3.14*radius);
	 return res;
 }
 public void display(){
	 System.out.println("id:"+id);
	 System.out.println("radius:"+radius);
	 System.out.println("area:"+area());
	 System.out.println("perimeter:"+perimeter());
 }
}
