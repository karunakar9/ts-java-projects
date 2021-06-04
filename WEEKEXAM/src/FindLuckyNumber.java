public class FindLuckyNumber {
	public static void main(String[] args) {
		String date = "01-january-1000";
		System.out.println(getLuckyNumber(date));
	}

	// return the lucky number, based on date of birth
	public static int getLuckyNumber(String date) {
		String days = date.substring(0, 2);
		int day = Integer.parseInt(days);
		int num1 = getSumOfDigits(day);
		int index1 = date.indexOf('-');
		int index2 = date.lastIndexOf('-');
		String mon = date.substring(index1 + 1, index2);
		String yr = date.substring(index2 + 1);
		int year = Integer.parseInt(yr);
		int month = convertMMMtoMM(mon);
		int num2 = getSumOfDigits(month);
		int num3 = getSumOfDigits(year);
		int number = num1 + num2 + num3;
		int result = getSumOfDigits(number);
		return getSumOfDigits(result);

	}

	// convert the given month in to number format(given "JAN" return 1)
	public static int convertMMMtoMM(String mon) {
		if ((mon.charAt(0) == 'j' || mon.charAt(0) == 'J') && (mon.charAt(1) == 'a' || mon.charAt(1) == 'A')
				&& (mon.charAt(2) == 'n' || mon.charAt(2) == 'N')) {
			return 1;
		}
		if ((mon.charAt(0) == 'f' || mon.charAt(0) == 'F') && (mon.charAt(1) == 'e' || mon.charAt(1) == 'E')
				&& (mon.charAt(2) == 'b' || mon.charAt(2) == 'B')) {
			return 2;
		}
		if ((mon.charAt(0) == 'm' || mon.charAt(0) == 'M') && (mon.charAt(1) == 'a' || mon.charAt(1) == 'A')
				&& (mon.charAt(2) == 'r' || mon.charAt(2) == 'R')) {
			return 3;
		}
		if ((mon.charAt(0) == 'a' || mon.charAt(0) == 'A') && (mon.charAt(1) == 'p' || mon.charAt(1) == 'P')
				&& (mon.charAt(2) == 'r' || mon.charAt(2) == 'R')) {
			return 4;
		}
		if ((mon.charAt(0) == 'm' || mon.charAt(0) == 'M') && (mon.charAt(1) == 'a' || mon.charAt(1) == 'A')
				&& (mon.charAt(2) == 'y' || mon.charAt(2) == 'Y')) {
			return 5;
		}
		if ((mon.charAt(0) == 'j' || mon.charAt(0) == 'J') && (mon.charAt(1) == 'u' || mon.charAt(1) == 'U')
				&& (mon.charAt(2) == 'n' || mon.charAt(2) == 'N')) {
			return 6;
		}
		if ((mon.charAt(0) == 'j' || mon.charAt(0) == 'J') && (mon.charAt(1) == 'u' || mon.charAt(1) == 'U')
				&& (mon.charAt(2) == 'l' || mon.charAt(2) == 'L')) {
			return 7;
		}
		if ((mon.charAt(0) == 'a' || mon.charAt(0) == 'A') && (mon.charAt(1) == 'u' || mon.charAt(1) == 'U')
				&& (mon.charAt(2) == 'g' || mon.charAt(2) == 'G')) {
			return 8;
		}
		if ((mon.charAt(0) == 's' || mon.charAt(0) == 'S') && (mon.charAt(1) == 'e' || mon.charAt(1) == 'E')
				&& (mon.charAt(2) == 'p' || mon.charAt(2) == 'P')) {
			return 9;
		}
		if ((mon.charAt(0) == 'o' || mon.charAt(0) == 'O') && (mon.charAt(1) == 'c' || mon.charAt(1) == 'C')
				&& (mon.charAt(2) == 't' || mon.charAt(2) == 'T')) {
			return 10;
		}
		if ((mon.charAt(0) == 'n' || mon.charAt(0) == 'N') && (mon.charAt(1) == 'o' || mon.charAt(1) == 'O')
				&& (mon.charAt(2) == 'v' || mon.charAt(2) == 'V')) {
			return 11;
		}
		if ((mon.charAt(0) == 'd' || mon.charAt(0) == 'D') && (mon.charAt(1) == 'e' || mon.charAt(1) == 'E')
				&& (mon.charAt(2) == 'c' || mon.charAt(2) == 'C')) {
			return 1;
		}

		return 0;
	}

	// add the sum of all digits for the given number
	public static int getSumOfDigits(int num) {
		int digit = 0, sum = 0;
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		return sum;

	}
}