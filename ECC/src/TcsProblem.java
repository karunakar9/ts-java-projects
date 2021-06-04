import java.util.Scanner;

public class TcsProblem {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int fine = 0, result = 0;
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int digit1 = num1 % 10;
		int digit2 = num2 % 10;
		if (digit2 == 9)
			fine = digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1;
		if (digit2 == 8)
			fine = digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1;
		if (digit2 == 7)
			fine = digit1 * digit1 * digit1 * digit1 * digit1 * digit1 * digit1;
		if (digit2 == 6)
			fine = digit1 * digit1 * digit1 * digit1 * digit1 * digit1;
		if (digit2 == 5)
			fine = digit1 * digit1 * digit1 * digit1 * digit1;
		if (digit2 == 4)
			fine = digit1 * digit1 * digit1 * digit1;
		if (digit2 == 3)
			fine = digit1 * digit1 * digit1;
		if (digit2 == 2)
			fine = digit1 * digit1;
		if (digit2 == 1)
			fine = digit1;
		else
			result = 1; 
		// result=Math.pow(digit1,digit2);
		 //fine=digit1^digit2;
		result = fine % 10;
		System.out.println(result);

	}
}
