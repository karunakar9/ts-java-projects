package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=0;
		div(a,b);
		System.out.println("rest of the code");
		int sum=a+b;
		System.out.println("Sum:"+sum);

	}
	public static int div(int a,int b){
		int div=0;
		try{
			div=a/b;
		}catch(Exception e){
			System.out.println(e);
		}
		return div;
	}

}
