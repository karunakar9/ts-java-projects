package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fio = null;

		try {
			fio = new FileInputStream("Hello123.txt");
			//int i = fio.read();
			/*while (i != -1) {
				System.out.print((char) i);
				i = fio.read();
			}*/
			
			 int i=0;
			   while((i=fio.read())!=-1){
			  System.out.print((char)(i));
			  }
			 
			fio.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			fio.close();
		}

	}

}
