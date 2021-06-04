package advProg;

public class ExponentValue {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		System.out.println(getExponent(num1, num2));
	}

	public static int getExponent(int num1, int num2) {
		int i = 1;
		while (i <= num2/2) {
			if (num2 == Math.pow(num1, i)) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
