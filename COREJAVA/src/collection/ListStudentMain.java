package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListStudentMain {

	public static void main(String[] args) {
		ListStudent s1 = new ListStudent("dihith", 36, 36, 36);
		ListStudent s2 = new ListStudent("karunakar", 85, 85, 85);
		ListStudent s3 = new ListStudent("mothi", 75, 75, 75);
		List<ListStudent> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(new ListStudent("anil", 35, 35, 35));
		System.out.println(list1);
		for(ListStudent s:list1)
			if(s.percentageOfStudents()>=80)
				System.out.println("Id:"+s.getId()+"   name:"+s.getName()+"   percentage:"+s.percentageOfStudents());

	}

}
