package slottest;

public class NextPrime {

	public static void main(String[] args) {
		int num = 24, i;
		for (i = num+1; i > 0; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 1) {
				break;
			}
		}
		System.out.println(i);
	}
}
