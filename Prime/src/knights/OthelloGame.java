package knights;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class OthelloGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the othello game  row and col size:");
		int rowSize = scan.nextInt();
		int colSize = scan.nextInt();
		char[][] othello = inputOthello(rowSize, colSize);
		System.out.println("Entered othello:");
		display(othello, rowSize, colSize);
		scan.close();
		char move = 'B';
		getNextEligibleStep(othello, rowSize, colSize, move);
	}

	public static char[][] inputOthello(int rowSize, int colSize) {
		char[][] othello = new char[rowSize][colSize];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input othello:");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				othello[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();
		return othello;
	}

	public static void display(char[][] othello, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(othello[i][j]);
			}
			System.out.println();
		}
	}

	public static /* Map<Integer, Integer> */void getNextEligibleStep(char[][] othello, int row, int col,
			char presentMove) {
		Map<Integer, Integer> rowForwardList = new HashMap<Integer, Integer>();
		
		Map<Integer, Integer> rowBackwardList = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (presentMove == othello[i][j]) {

					int rowEF[] = RowEligibleForward(i, j, othello, presentMove);
					if(rowEF.length==2)
					rowForwardList.put(rowEF[0], rowEF[1]);
					
					int rowEB[] = RowEligibleBackward(i, j, othello, presentMove);
					if(rowEB.length==2)
					rowBackwardList.put(rowEB[0], rowEB[1]);

				}
			}

		}
		// return ;
		Set<Entry<Integer, Integer>> entrySet = rowForwardList.entrySet();
		for (Entry<Integer, Integer> e : entrySet)
			System.out.println(e.getKey() + " AND " + e.getValue());
		
		Set<Entry<Integer, Integer>> entrySet1 = rowBackwardList.entrySet();
		for (Entry<Integer, Integer> e : entrySet1)
			System.out.println(e.getKey() + "AND" + e.getValue());


	}

	private static int[] RowEligibleForward(int iValue, int jValue, char[][] othello, char presentMove) {
		int i = iValue;
		for (int j = jValue + 1; j < 8; j++) {
			if (othello[i][j] == presentMove)
				break;
			else if (othello[i][j] != presentMove) {
				if (othello[i][j] == '_' ) {
					int arr1[] = { i, j };
					return arr1;
				}
			}
		}
		int arr[]={9,9};
		return arr;
	}
	
	private static int[] RowEligibleBackward(int iValue, int jValue, char[][] othello, char presentMove) {
		int i = iValue;
		for (int j = jValue - 1; j >= 0; j--) {
			if (othello[i][j] == presentMove)
				break;
			if (othello[i][j] != presentMove)
				if (othello[i][j] == '_' ) {
					int arr1[] = { i, j };
					return arr1;
				}
		}
		int arr[]={9,9};
		return arr;
	}


}
