package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> colorset = new HashSet<>();
		/*1." HashSet"donot maintain insertion order follows hashtable
		 * 2.allows null
		 */
		//Set<String> colorset = new LinkedHashSet<>();
		/*1.LinkedHashSet maintain insertion order
		 * 2.allows null
		 */
		//Set<String> colorset = new TreeSet<>();
		/*1.TreeSet maintains alphabetical order
		 * 2.dont allows null
		 */
		String s= null;
		colorset.add("red");
		colorset.add("yellow");
		colorset.add("blue");
		colorset.add(s);
		System.out.println(colorset);
		for(String obj:colorset)
			System.out.println(obj);
		

	}

}
