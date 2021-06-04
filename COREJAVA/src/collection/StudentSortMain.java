package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortMain {

	public static void main(String[] args) {
		List<StudentSort> list = new ArrayList<>();
		list.add(new StudentSort("dihith", 35, 35, 35));
		list.add(new StudentSort("eshwar", 65, 65, 65));
		list.add(new StudentSort("mothilal", 85, 85, 85));
		list.add(new StudentSort("anil", 35, 45, 55));
		Collections.sort(list);//sorted name wise
		System.out.println(list);

	}

}
