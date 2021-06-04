package ModularProgramming;

public class ProductPanlindrome {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 99;
		System.out.println(ProductPanlindrome.getCount(START, END));

	}

	public static int getCount(int start, int end) {
		int count = 0,i,j,r,temp,prod;
		for (i = start; i <= end; i++) {
			for (j = start; j <= end; j++) {
				prod = i * j;
				 temp = prod;
                int sum =0 ;
				while (prod > 0) {
					 r = prod % 10;
					sum = (sum * 10) + r;
					prod /= 10;
				}

				if (temp == sum)
					count++;
			}

		}

		return count;
	}
}