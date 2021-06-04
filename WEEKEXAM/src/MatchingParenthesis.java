public class MatchingParenthesis {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(isMatchingParenthesis("(2+3)"));
		System.out.println(isMatchingParenthesis("((a + b) * c)"));
		System.out.println(isMatchingParenthesis("(a + b) * c)"));
		System.out.println(isMatchingParenthesis(")(a + b) * c))"));

	}

	public static boolean isMatchingParenthesis(String text) {
		if (text == null)
			return false;
		if (text == "")
			return true;

		if (')' == text.charAt(0))
			return false;
		int count1 = 0, count2 = 0;
		for (int i = 0; i < text.length(); i++) {
			if ('(' == text.charAt(i))
				count1++;
		}
		for (int j = 0; j < text.length(); j++) {
			if (')' == text.charAt(j)) {
				count2++;
			}
			if (count2 == count1) {
				return true;
			}
		}
		return false;
	}

}