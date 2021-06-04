import java.util.Scanner;

public class SumOfDigits01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(getSumOfDigits(num));
	}

	public static int getSumOfDigits(int num) {
		if (num < 10 || num > 99)
			return 0;
		int a = num % 10;
		int b = num / 10;
		int sum = a + b;
		return sum;

	}
}