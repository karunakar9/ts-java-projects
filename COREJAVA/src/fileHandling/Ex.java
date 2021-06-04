package fileHandling;


public class Ex  {
	public static void throwit(){
		System.out.println("throwit");
		throw new RuntimeException();
	}
	
	public static void main(String[] ags) {
		
try{
	System.out.println("hello");
	throwit();
}
catch(Exception e){
	System.out.println("caught");
}
finally{
	System.out.println("finally");
}System.out.println("after");
	}
}