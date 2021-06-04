package exceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 9;
		try{
		validate(age);
		}catch(Exception e){
			System.out.println(e);
		}

	}
	public static void validate(int age) /*throws ArithmeticException*/{
		if(age >=18)
			System.out.println("valid age");
		else 
			throw new ArithmeticException();
	}

}
