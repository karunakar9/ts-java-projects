package mapsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("physics", "hc varma");
		Book b2 = new Book("machines", "jb gupta");
		Book b3 = new Book("power system", "c l wadhwa");
		Map<Integer, Book> phoneMap = new HashMap<>();
		phoneMap.put(b1.getId(), b1);
		phoneMap.put(b2.getId(), b2);
		phoneMap.put(b3.getId(), b3);
		//System.out.println(phoneMap);
		Set<Entry<Integer, Book>> entrySet = phoneMap.entrySet();
		for (Entry<Integer, Book> e : entrySet)
			System.out.println(e);

	}

}
