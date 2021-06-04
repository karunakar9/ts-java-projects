package mapsPrograms;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("INDIA", "DELHI");// (key,value)
		countryMap.put("USA", "washington Dc");
		countryMap.put("china", "Beijing");
		countryMap.put("nepal", "kathmandu");
		System.out.println(countryMap);
		
		System.out.println(countryMap.get("china"));// returns value
		System.out.println(countryMap.keySet());// returns keys
		System.out.println(countryMap.values());// returns values
		System.out.println("==================================================");
		countryMap.put("INDIA", "DELHI");
		countryMap.put("USA", "washington Dc");
		countryMap.put("china", "Beijing");
		countryMap.put("nepal", "kathmandu");
		countryMap.put("nepal", "abc");// override takes place
		System.out.println(countryMap);
		System.out.println("==================================================");
		Set<String> keys = countryMap.keySet();
		for (String K : keys)
			System.out.println(K + "  " + countryMap.get(K));
		System.out.println("=========entry=================");
		// entry having key and value
		Set<Entry<String, String>> entry = countryMap.entrySet();
		System.out.println(entry);
		for (Entry<String, String> e : entry)
			System.out.println(e.getKey() + "_" + e.getValue());

	}

}
