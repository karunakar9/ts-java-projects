package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr= new FileReader("Hello123.txt");
			int i=0;
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}finally{
			fr.close();
		}

	}

}
