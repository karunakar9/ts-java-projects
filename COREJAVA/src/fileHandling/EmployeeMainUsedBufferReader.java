package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMainUsedBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		BufferedReader br = null;
		ArrayList<Employee> employeeList = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader("Employee.txt"));
			while ((line = br.readLine()) != null) {

				String arr[] = line.split(" ");
				employeeList.add(new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3]));

			}
			for (Employee e : employeeList)
				System.out.println(e);
			System.out.println("==============");
			/*Iterator<Employee> itr =employeeList.iterator();
			while(itr.hasNext()){
				String em=itr.next().getDesignation();
				if(em=="developer"){
					System.out.println(itr.next());
				}
						
			}*/
			for(Employee e:employeeList)
				if(e.getDesignation().equals("developer"))
					System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
