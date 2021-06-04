package advProg;

public class LotteryTicket {

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 2;
		int var3 = 1;
		System.out.println(getLotteryValue(var1, var2, var3));
	}

	public static int getLotteryValue(int a, int b, int c) {
		if (a == b && a == c)
			return 20;
		else if (a != b && b != c && c != a)
			return 0;
		else
			return 10;
	}

}
