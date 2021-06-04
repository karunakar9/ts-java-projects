package slottest;

public class miniOfInt {

	public static void main(String[] args) {
		int a = 12;
		int b = 42;
		int c = 11;
		int d = 14;
		if(a < b && a < c && a < d) 
			System.out.println(a);
		else if(b < a && b < c && c < d) 
			System.out.println(b);
		else if(c < a && c < b && c < d)
			System.out.println(c);
		else 
			System.out.println("non");
	}

}
