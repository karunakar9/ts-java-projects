package problems;

import java.util.Arrays;

public class ArrangeCharInIncresingOrder {

	public static void main(String[] args) {
		String name="karunakar";
		char[] charArray=name.toCharArray();
		Arrays.sort(charArray);
		for (char c : charArray) {
			System.out.println(c);
		}

	}

}
