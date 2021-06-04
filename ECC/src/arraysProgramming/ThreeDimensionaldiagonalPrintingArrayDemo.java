package arraysProgramming;

import java.util.Scanner;

public class ThreeDimensionaldiagonalPrintingArrayDemo {

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
		diagonalElements(matrix);
		scan.close();
	}

	public static void diagonalElements(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ((i == j))
					System.out.print(matrix[i][j] + " ");
				else if (i + j == matrix.length - 1)
					System.out.print(matrix[i][j] + " ");
				else
					System.out.print("0" + " ");
			}
			System.out.println();
		}

	}
}
