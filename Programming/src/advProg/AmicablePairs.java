package advProg;

public class AmicablePairs {

	public static void main(String[] args) {
		AmicablePairs(100000, 999999);
	}

	public static void AmicablePairs(int start, int end) {
		int aliq = 0;
		for (int i = start; i <= end; i++) {
			aliq = getAliquote(i);
			if (aliq >= i && aliq <= end) {
				if (i == getAliquote(aliq) && i != aliq)

					System.out.println(i + "," + aliq);
			}
		}

	}

	public static int getAliquote(int num) {
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
