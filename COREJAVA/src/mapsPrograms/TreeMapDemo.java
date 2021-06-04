package mapsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> bookmap = new TreeMap<>();
		bookmap.put("hc varma", 1230);
		bookmap.put("j b guptha", 456);
		bookmap.put("asdf", 1500);
		System.out.println(bookmap);// sorting depends on key
		System.out.println("===============sort based on value==============");
		// step 1
		Set<Entry<String, Integer>> entry = bookmap.entrySet();
		// step 2
		List<Entry<String, Integer>> list = new ArrayList<>(entry);
		// step 3
		Collections.sort(list, new SortBYValueInTreeDemo());
		System.out.println(list);
		System.out.println("=========LinkedHashMap==================");
		LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> e : list)
			linkedMap.put(e.getKey(), e.getValue());
		System.out.println(linkedMap);
	}

}
