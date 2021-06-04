package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}
	public static void test(){
		FileInputStream fio = null;
		try{
			fio = new FileInputStream("Hello.txt");
		}catch(FileNotFoundException e){
			System.out.println(e);
		}finally{
			System.out.println("final block");
		}
	}

}
