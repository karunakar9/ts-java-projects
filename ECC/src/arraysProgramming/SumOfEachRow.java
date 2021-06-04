package arraysProgramming;

import java.util.Scanner;

// Wap to print sum of each row elements
public class SumOfEachRow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of row and coloumn ;");
		int row = scan.nextInt();
		int coloumn = scan.nextInt();
		int matrix[][] = new int[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				matrix[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		SumofRowsInMatric(matrix);
		scan.close();

	}

	public static void SumofRowsInMatric(int matrix[][]) {
		int sum;
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
			//	System.out.print(matrix[i][j] + " ");
				sum = sum + matrix[i][j];
			}
			System.out.println("Sum of " + (i + 1) + "row " + sum);
		}
	}

}
