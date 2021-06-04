package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("india");
		list1.add("usa");
		list1.add("UK");
		list1.add("kodad");
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
