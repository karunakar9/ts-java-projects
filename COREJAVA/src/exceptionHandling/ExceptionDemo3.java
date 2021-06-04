package exceptionHandling;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int len = 0;
		String s = null;
		try {
			a[5] = 50 / 0;
			len = s.length();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code.......");

	}

}
