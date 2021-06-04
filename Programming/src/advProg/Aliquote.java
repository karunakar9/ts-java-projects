package advProg;

public class Aliquote {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(isAliquoteNum(num));
		 System.out.println(getFactors(284));

	}

	public static boolean isAliquoteNum(int num) {
		int temp = num;
		if (temp == getFactors(num)) {
			return true;
		}
		return false;
	}

	public static int getFactors(int num) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (i == num / i) {
					sum = sum + i;
				} else
					sum = sum + i + (num / i);

			}
		}
		return sum;
	}

}
