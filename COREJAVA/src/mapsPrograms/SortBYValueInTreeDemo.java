package mapsPrograms;

import java.util.Comparator;
import java.util.Map.Entry;

public class SortBYValueInTreeDemo  implements Comparator<Entry<String,Integer>>{

	@Override
	public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
		// TODO Auto-generated method stub
		return obj1.getValue().compareTo(obj2.getValue());
	}
	

}
