package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOneFileTOAnother {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		FileWriter fw= null;
		int i=0;
		try {
			fr =new FileReader("File1.txt");
			fw=new FileWriter("File2.txt");
			while((i=fr.read())!=-1){
				System.out.print((char)i);
				fw.append((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}finally{
			fr.close();
			fw.close();
		}
		

	}

}
