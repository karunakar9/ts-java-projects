package trainmoPrograms;

import java.util.Scanner;

public class PrimeNumInGivenRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		primesinRange(num);
	}
	public static void primesinRange(int limit){
		int  i, j;
		for (j = 1; j <= limit; j++) {
			int count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if(count==2)
				System.out.println(j);
		}
	}

}
