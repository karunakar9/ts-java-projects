package string.problems;

public class StringDemo {

	public static void main(String[] args) {
	String str1 = "hello world";
	String str2 = new String("hello world");
	System.out.println(str1.length());
	int len=str1.length();
	System.out.println(len);
	System.out.println("length of the string :"+len);
	System.out.println(str1.charAt(0));
	System.out.println(str1.indexOf('h'));
	System.out.println(str1.lastIndexOf('o'));
	System.out.println("substring :" + str1.substring(2));
	System.out.println("substring :" + str1.substring(2, 7));
   
	}

}
