package knights;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		char puzzle[][] = initializePuzzle();
		while (!gameOver(puzzle)) {
			System.out.println("====oprations=====");
			System.out.println("A-moves above, B-moves below , R-moves right ,L-moves left");
			Scanner scan = new Scanner(System.in);
			char move = scan.next().charAt(0);
			if (move == 'A' || move == 'B' || move == 'R' || move == 'L') {
				if (isValid(puzzle, move)) {
					char[][] puzzle1 = updatePuzzle(puzzle, move);
					displayPuzzle(puzzle1);
				} else {
					System.out.println("Bad configuration");
					break;
				}
			} else {
				System.out.println("Wrong move Game end");
				break;
			}

		}
		System.out.println("Game over! you win!");
	}

	public static char[][] initializePuzzle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter rows and coloumns:");
		int row = scan.nextInt();
		int column = scan.nextInt();
		char[][] puzzle = new char[row][column];
		System.out.println("enter the input puzzle");
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				puzzle[i][j] = scan.next().charAt(0);
			}

		}
		return puzzle;

	}

	public static int[] getEmptySpace(char puzzle[][]) {
		int i, j;
		int[] position = new int[2];
		for (i = 0; i < puzzle.length; i++) {
			for (j = 0; j < puzzle.length; j++) {
				if (puzzle[i][j] == '_') {
					position[0] = i;
					position[1] = j;
					return position;
				}
			}

		}
		return null;
	}

	static boolean isValid(char[][] puzzle, char move) {
		int[] position = getEmptySpace(puzzle);
		int row = position[0];
		int column = position[1];

		if (move == 'A')
			return row - 1 >= 0;
		else if (move == 'B')
			return row + 1 < puzzle.length;
		else if (move == 'L')
			return column - 1 >= 0;
		else if (move == 'R')
			return column + 1 < puzzle[0].length;
		else {
			System.out.println("bad move");
		}
		return false;

	}

	static char[][] updatePuzzle(char[][] puzzle, char move) {
		int[] currentSpace = getEmptySpace(puzzle);
		int row = currentSpace[0];
		int column = currentSpace[1];
		char temp;

		if (move == 'A') {
			temp = puzzle[row][column];
			puzzle[row][column] = puzzle[row - 1][column];
			puzzle[row - 1][column] = temp;
		} else if (move == 'B') {
			temp = puzzle[row][column];
			puzzle[row][column] = puzzle[row + 1][column];
			puzzle[row + 1][column] = temp;
		} else if (move == 'R') {
			temp = puzzle[row][column];
			puzzle[row][column] = puzzle[row][column + 1];
			puzzle[row][column + 1] = temp;
		} else if (move == 'L') {
			temp = puzzle[row][column];
			puzzle[row][column] = puzzle[row][column - 1];
			puzzle[row][column - 1] = temp;
		}

		return puzzle;

	}

	public static void displayPuzzle(char[][] puzzle) {

		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				System.out.print(puzzle[i][j]);
			}
			System.out.println();

		}

	}

	public static boolean gameOver(char[][] puzzle) {
		String result = "ABCDEFGHIJKLMNOPQRSTUVWX";
		String obtainedResult = "";
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				obtainedResult = obtainedResult + puzzle[i][j];
			}
		}
		obtainedResult=obtainedResult.replace("_", " ");
		if (result.equals(obtainedResult.trim())) {
			return true;
		} else {
			return false;
		}
	}

}
