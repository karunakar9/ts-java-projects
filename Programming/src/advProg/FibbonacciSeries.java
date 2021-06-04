package advProg;

public class FibbonacciSeries {

	public static void main(String[] args) {
		System.out.println(inputString("m"));

	}

	public static int inputString(String str) {
		int index = str.length() - 1;
		char ch = str.charAt(index);
		str = "";
		for (char a = 'a'; a <= 'z'; a++) {
			str += a;
		}
		int num = str.indexOf(ch) + 1;
		return getNthTermOfFibonacciSeries(num);
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		int a, b, c = 0, i;
		int n = nthTerm;
		a = 0;
		b = 1;
		for (i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;

	}

}
