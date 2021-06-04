package loopsPrograms;

public class NextPAlindromeOfNum {

	public static void main(String[] args) {
		System.out.println(nextPalindrome(121));
		// nextPalindrome(121);
	}


	public static int nextPalindrome(int start) {
		int flag = 0, rev = 0;
		for (int i = start + 1; i > 0; i++) {
			rev = 0;
			int temp = i;
			while (temp > 0) {
				int digit = temp % 10;
				rev = rev * 10 + digit;
				temp /= 10;
			}
			if (i == rev) {
				flag = 1;
				break;

			}

		}
		if (flag == 1)
			return rev;
		return 1;
	}

}
