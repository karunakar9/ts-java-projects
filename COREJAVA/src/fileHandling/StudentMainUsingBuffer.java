package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentMainUsingBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentFile> studentList = new ArrayList<>();
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader("students.csv"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String arr[] = line.split(",");

				// System.out.println(arr[i]);

				StudentFile s = new StudentFile(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
				studentList.add(s);
			}
			for(StudentFile s:studentList)
				System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}

	}

}
