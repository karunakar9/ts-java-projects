package arraysProgramming;

import java.util.Scanner;

public class IdentityMatrixOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		identity(matrix);
		scan.close();

	}

	public static void identity(int matrix[][]) {
		int flag = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j && matrix[i][j] != 1) {
					flag = 1;
					break;
				}
				if (i != j && matrix[i][j] != 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				break;
		}
		if (flag == 1)
			System.out.println("not an identity matrix");
		else
			System.out.println("it is an identity matrix");

	}

}
