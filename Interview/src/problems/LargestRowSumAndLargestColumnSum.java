package problems;

import java.util.Scanner;

public class LargestRowSumAndLargestColumnSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rowSize = scan.nextInt();
		int colSize = scan.nextInt();
		int[][] array = new int[rowSize][colSize];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scan.nextInt();
			}

		}
		//
		scan.close();
		int rowMax = rowMaximum(array);

		int colMax = colMaximum(array);

		System.out.println(rowMax + colMax);

	}

	private static int colMaximum(int[][] array) {
		int colMax = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[j][i];

			}
			if (colMax < sum) {
				colMax = sum;
			}
		}
		return colMax;
	}

	private static int rowMaximum(int[][] array) {
		int rowMax = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum = sum + array[i][j];

			}
			if (rowMax < sum) {
				rowMax = sum;
			}
		}
		return rowMax;
	}

}
