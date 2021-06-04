public class OddPalindromes01 {
	public static void main(String[] args) {
		int start = 1500;
		int end = 2000;
		System.out.println("\"" + generateOddPalindromes(start, end) + "\"");
	}

	public static String generateOddPalindromes(int start, int limit) {
		// ADD YOUR CODE HERE
		String res = "";
		if (start <= 0 || limit <= 0) {
			return "-1";
		}
		if (start >= limit)
			return "-2";

		for (int i = start; i <= limit; i++) {

			if (isPalindrome(i) && isAllDigitsOdd(i))
				res = res + i + ",";
		}
		if (res.length() == 0) {
			return "-3";
		}
		int index = res.lastIndexOf(",");
		String str = res.substring(0, index);

		return str;
	}

	public static boolean isPalindrome(int num) {
		// ADD YOUR CODE HERE
		int temp = num;
		int rev = reverse(num);
		if (temp == rev)
			return true;
		else
			return false;

	}

	public static int reverse(int num) {
		// ADD YOUR CODE HERE
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

	public static boolean isAllDigitsOdd(int num) {
		// ADD YOUR CODE HERE
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0 && digit != 0) {
				return false;
			}
			num /= 10;

		}
		return true;
	}
}
