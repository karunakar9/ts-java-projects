package classAndObject;

public class Triangle {
	private int id;
	private int side1;
	private int side2;
	private int side3;
	static int idGenerator=1000;

	
	Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.id=++idGenerator;
	}
/*	public void setSide1(int side1){
		this.side1=side1;
	}
	public int getSide1(){
		return this.side1;
		
	}
	public void setSide2(int side2){
		this.side2=side2;
	}
	public int getSide2(){
		return this.side2;
		
	}
	public void setSide3(int side3){
		this.side3=side3;
	}
	public int getSide3(){
		return this.side3;
		
	}*/
	public double area(){
		double s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
		
	}
	@Override
	public String toString() {
		return "Triangle [id=" + id + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", area()="
				+ area() + "]";
	}
	public static Triangle compare(Triangle t1, Triangle t2){
		if(t1.area()>t2.area())
			return t1;
		else 
			return t2;
	
	}
     
}
