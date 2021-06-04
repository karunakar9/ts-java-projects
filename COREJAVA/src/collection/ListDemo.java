package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> leapList = new ArrayList<Integer>();
		leapList.add(1996);
		leapList.add(2000);
		leapList.add(2000);
		leapList.add(2008);
		leapList.add(2004);
		System.out.println(leapList);
		
		System.out.println("Size of the list:" + leapList.size());
		
		System.out.println(leapList.get(0));
		
		leapList.remove(0);
		
		System.out.println(leapList);
		leapList.remove(new Integer(2008));
		System.out.println(leapList);
		
		System.out.println("=================");
		for (Integer obj : leapList)
			System.out.println(obj);

	}

}
