package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader("Student.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String arr[] = line.split(" ");

				// System.out.println(arr[i]);

				Student s = new Student(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]),
						Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));
				studentList.add(s);
			}
				Collections.sort(studentList);
				for (Student st : studentList)
					System.out.println(st);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		} finally {
			br.close();
		}

	}

}
