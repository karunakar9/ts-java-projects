package mapsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Long> phoneMap = new HashMap<>();
		phoneMap.put("mothilal", 9876543l);
		phoneMap.put("eswar", 76543456l);
		phoneMap.put("dihith", 345676543l);
		phoneMap.put("nitin", 6543456l);
		System.out.println("=====entry map==============================");
		Set<Entry<String,Long>> entry = phoneMap.entrySet();
		for(Entry<String,Long> e:entry)
			System.out.println(e);

	}

}
