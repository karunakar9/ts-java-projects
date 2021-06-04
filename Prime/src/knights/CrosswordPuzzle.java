package knights;

import java.util.*;

public class CrosswordPuzzle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter row and coloumn size:");
		int row = scan.nextInt();
		int col = scan.nextInt();
		char CrosswordPuzzle[][] = inputPuzzle(row, col);
		int[][] numberedPuzzle = (getNumberedCrosswordPuzzle(CrosswordPuzzle, row, col));
		// display(numberedPuzzle,row,col);
		scan.close();

		across(numberedPuzzle, CrosswordPuzzle, row, col);
		down(numberedPuzzle, CrosswordPuzzle, row, col);
	}

	public static char[][] inputPuzzle(int row, int col) {
		Scanner scan = new Scanner(System.in);
		char[][] crosswordPuzzle = new char[row][col];
		System.out.println("enter the input puzzle");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				crosswordPuzzle[i][j] = scan.next().charAt(0);
			}

		}
		scan.close();
		return crosswordPuzzle;

	}

	/*
	 * private static void display(int[][] numberedPuzzle, int row, int col) {
	 * for (int i = 0; i < row; i++) { for (int j = 0; j < col; j++) {
	 * System.out.print(numberedPuzzle[i][j]); } System.out.println(); }
	 * 
	 * }
	 */

	public static int[][] getNumberedCrosswordPuzzle(char[][] crosswordPuzzle, int row, int col) {
		int autoIncrement = 1;
		int numberedPuzzles[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					if (crosswordPuzzle[i][j] != '*') {
						numberedPuzzles[i][j] = autoIncrement++;
					}
				} else {
					if (((crosswordPuzzle[i][j - 1]) == '*' && crosswordPuzzle[i][j] != '*')) {
						numberedPuzzles[i][j] = autoIncrement++;
					} else if (crosswordPuzzle[i - 1][j] == '*' && crosswordPuzzle[i][j] != '*') {
						numberedPuzzles[i][j] = autoIncrement++;
					}

				}

			}
		}
		return numberedPuzzles;

	}

	public static void across(int[][] numberedPuzzle, char[][] puzzle, int row, int Col) {
		System.out.println("Across");
		for (int i = 0; i < row; i++) {
			String result = "";
			int num = 0, count = 0;
			for (int j = 0; j < Col; j++) {
				if (puzzle[i][j] != '*') {
					count++;
					result += puzzle[i][j];
					if (count == 1) {
						num = numberedPuzzle[i][j];
					}
				}
				if ((puzzle[i][j] == '*') || (j == Col - 1)) {
					if (result != "") {
						System.out.println(num + ". " + result);
					}
					result = "";
					count = 0;
				}
			}
		}
	}

	public static void down(int[][] numberedPuzzle, char[][] puzzle, int row, int col) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		System.out.println("down");
		for (int i = 0; i < col; i++) {
			String result = "";
			int num = 0, count = 0;
			for (int j = 0; j < row; j++) {
				if (puzzle[j][i] != '*') {
					count++;
					result += puzzle[j][i];
					if (count == 1) {
						num = numberedPuzzle[j][i];
					}
				}
				if ((puzzle[j][i] == '*') || (j == row - 1)) {
					if (result != "") {
						map.put(num, result);
						// System.out.println(num + ". " + result);
					}
					result = "";
					count = 0;
				}
			}
		}

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "." + m.getValue());
		}
	}

}
