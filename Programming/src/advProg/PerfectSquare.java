package advProg;

public class PerfectSquare {

	public static void main(String[] args) {
		getPerfectSquareNum();

	}

	public static void getPerfectSquareNum() {
		for (int num = 1000; num <= 9999; num++) {
			if (isPerfectSquareNum(num) && isAllDigitsEvn(num))
				System.out.println(num);

		}

	}

	public static boolean isPerfectSquareNum(int num) {
		double sq = Math.sqrt(num);
		return ((sq - Math.floor(sq)) == 0);
	}

	public static boolean isAllDigitsEvn(int num) {
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			if (digit % 2 != 0) {
				return false;
			}
			num /= 10;

		}
		return true;

	}

}
