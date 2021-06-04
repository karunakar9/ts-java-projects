import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;



public class MainClass {

	public static void main(String[] args) {
		 FileReader reader=null;
		try {
			reader = new FileReader("prop.properties");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}  
	      
		    Properties p=new Properties();  
		    try {
				p.load(reader);
			} catch (IOException e) {
				System.out.println("IOException");
			}  
		      
		    System.out.println(p.getProperty("user"));  
		    System.out.println(p.getProperty("password"));
}

	
}
