public class AnagramsProg {
	public static void main(String[] args) {
		String str1 = "abc d";
		String str2 ="xy xy";
		if (validateStrings(str1, str2) == 1) {
			System.out.println(isAnagrams(str1, str2));
		} else
			System.out.println(validateStrings(str1, str2));
	}

	public static int validateStrings(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return -1;
		}
		for (int k = 0; k < str1.length(); k++) {
			if (str1.charAt(k) == ' ') {
				return -2;
			}
		}
		for (int k = 0; k < str2.length(); k++) {
			if (str2.charAt(k) == ' ') {
				return -2;
			}
		}

		if (str1.trim().length() == str2.trim().length()) {
			return 1;
		}
		
		if (isAnagrams(str1, str2)) {
			return 1;
		}

		return 0;
	}

	public static boolean isAnagrams(String str1, String str2) {
		int count;
		for (int i = 0; i < str1.length(); i++) {
			count = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
			if (count <= 0)
				return false;
		}
		return true;
	}
}