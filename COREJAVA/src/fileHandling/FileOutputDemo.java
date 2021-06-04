package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fo=null;
		FileOutputStream fo2=null;
		try {
			String name="desireddy karunakar reddy";
			String name2="mothilal";
			String name3="eswar";
			 fo=new FileOutputStream("Temp.txt");
			fo.write(name.getBytes());
			fo.write(name2.getBytes());
			fo2=new FileOutputStream("Temp.txt",true);
			fo2.write(name3.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}catch (IOException e){
			System.out.println(e);
		}finally{
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		

	}

}
