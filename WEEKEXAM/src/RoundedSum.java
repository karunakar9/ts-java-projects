public class RoundedSum {
	public static void main(String[] args) {
		int a = 23, b = 34, c = 66;
		System.out.println(sumOfRoundedValues(a, b, c));
	}

	public static int sumOfRoundedValues(int n1, int n2, int n3) {
		int temp1 = 0, temp2 = 0, temp3 = 0, sum = 0;
		if(n1<=0 || n2<=0 ||n3<=0)
			return -1;
		temp1 = n1 % 10;
		if (temp1 < 5) {
			int num1 = n1 / 10;
			sum = num1 * 10;
		} else {
			int num1 = n1 / 10;
			sum = sum + num1 * 10 + 10;
		}
		temp2 = n2 % 10;
		if (temp2 < 5) {
			int num2 = n2 / 10;
			sum = sum + num2 * 10;
		} else {
			int num2 = n2 / 10;
			sum = sum + num2 * 10 + 10;
		}
		temp3 = n3 % 10;
		if (temp3 < 5) {
			int num3 = n3 / 10;
			sum = sum + num3 * 10;
		} else {
			int num3 = n3 / 10;
			sum = sum + num3 * 10 + 10;
		}
		return sum;
	}
}