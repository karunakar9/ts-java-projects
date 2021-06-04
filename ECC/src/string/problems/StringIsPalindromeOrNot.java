package string.problems;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		String name = "madam isi madam";
		String rev = "";
		String temp = name;
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println(rev);
		if (name.equals(rev))
			System.out.println("given string is palindrome");
		else
			System.out.println("given string is not palindrome");
	}
}
