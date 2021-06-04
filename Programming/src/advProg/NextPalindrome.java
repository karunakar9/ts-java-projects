package advProg;

public class NextPalindrome {

	public static void main(String[] args) {
		int num = 121;
		System.out.println(nextPalindrome(num));
	}

	public static int nextPalindrome(int number) {
            int num=number+1;
		while (!isPalindrome(num)) {
			num++;
		}
		return num;
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		if (temp == reverseNum(num)) {
			return true;
		} else
			return false;
	}

	public static int reverseNum(int num) {
		int rev = 0, digit = 0;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

}
