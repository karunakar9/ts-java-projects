package advProg;

public class OddPalindrome {

	public static void main(String[] args) {
		int num = 1331;
		System.out.println(isOddPalindrome(num));

	}

	public static boolean isOddPalindrome(int num) {
		return (isPalindrome(num) && isAllDigitsOdd(num)); 
			
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int sum = reverse(num);
		if (temp == sum)
			return true;
		else
			return false;

	}

	public static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

	public static boolean isAllDigitsOdd(int num) {
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
