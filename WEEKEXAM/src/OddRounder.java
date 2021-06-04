class OddRounder {
	public static void main(String[] args) {
		int num = 327;
		System.out.println(oddRounder(num));
	}

	public static int oddRounder(int num) {
		int digit = 0, b = 0;
		if (num < 0)
			return -1;
		if (num == 0)
			return -2;
		if (num % 2 == 0) {
			return num;
		}

		else
			b = (num / 10) * 10 + 10;
		return b;

	}

}