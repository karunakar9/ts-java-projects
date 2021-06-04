package exceptionHandling;

public class exceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			int len = s.length();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("rest of code.....");

	}

}
