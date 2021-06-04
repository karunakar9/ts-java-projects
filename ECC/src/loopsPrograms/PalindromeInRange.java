package loopsPrograms;

public class PalindromeInRange {

	public static void main(String[] args) {
		// palindrome in given range of 1000 to 1500
		int initial = 1000, flimit = 1500;
		palindrome(initial, flimit);
	}

	public static void palindrome(int start, int end) {
		int num, digit;

		for (num = start; num <= end; num++) {
			int temp = num;
			int rev = 0;
			while (temp > 0) {
				digit = temp % 10;
				rev = (rev * 10) + digit;
				temp = temp / 10;
			}

			if (rev == num)
				System.out.println(rev);
		}

	}
}
