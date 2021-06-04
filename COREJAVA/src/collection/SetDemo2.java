package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set<String> colorset = new HashSet<>();
		String s = null;
		colorset.add("red");
		colorset.add("yellow");
		colorset.add("blue");
		colorset.add(s);
		System.out.println(colorset);
		System.out.println(colorset.size());// size
		colorset.remove("red");// remove
		System.out.println(colorset);

		Set<String> colorset1 = new HashSet<>();
		String s2 = null;
		colorset1.add("orange");
		colorset1.add("black");
		colorset1.add("pink");
		colorset1.add(s);
		colorset.addAll(colorset1);
		System.out.println(colorset);
		colorset.removeAll(colorset);
		System.out.println(colorset);

	}

}
