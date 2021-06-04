package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("rest of code....");

	}
	public static void test() throws FileNotFoundException{
		FileInputStream fio=null;
		fio= new FileInputStream("Hello.Txt");//file not found it throws exception to test() method
	}

}
