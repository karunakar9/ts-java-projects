package trainmoPrograms;

public class StringPlusOne {

	public static void main(String[] args) {
		// Then change the alphabets to their next alphabet and return the new
		// String.
		// Input: Hello Output: Ifmmp
		String str = "Hello";
		System.out.println(nextString(str));
		// nextString(str);

	}

	public static String nextString(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = ch;
			num += 1;
			char cha = (char) num;
			// System.out.print(cha);
			res = res + cha;

		}
		return res;
	}

}
