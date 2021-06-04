package string.problems;

public class ChangeCaseOfText {

	public static void main(String[] args) {
		String str = "This Is a SampLe TeXt";
		System.out.println(convertCase(str));
	}

	public static String convertCase(String str) {
		String result = "";
		char a;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c))
				a = Character.toUpperCase(c);
			else 
				a = Character.toLowerCase(c);
			result = result + a;
		}
		return result;
	}

}
