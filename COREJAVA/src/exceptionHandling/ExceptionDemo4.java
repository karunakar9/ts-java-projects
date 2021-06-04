package exceptionHandling;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		} finally {
			System.out.println("final block......");
		}
		System.out.println("rest of the code will execute");
	}

}
