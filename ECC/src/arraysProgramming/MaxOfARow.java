package arraysProgramming;

import java.util.Scanner;

public class MaxOfARow {

	public static void main(String[] args) {
		// max of each row
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
		maxOfEachRow(matrix);
		scan.close();

	}

	public static void maxOfEachRow(int matrix[][]) {
		int max = 0, j;
		for (int i = 0; i < matrix.length; i++) {
			max = 0;
			for (j = 0; j < matrix[i].length; j++) {
				// if need max in colomn do interchage i and j in below
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}

			}
			System.out.println("max in " + (i + 1) + " row is " + max + " ");

		}
	}

}
