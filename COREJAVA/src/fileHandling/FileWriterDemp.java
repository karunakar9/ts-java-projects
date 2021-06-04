package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			String name ="EShwar";
			fw=new FileWriter("Writer.txt");
			fw.write(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}finally{
			fw.close();
		}
		

	}

}
