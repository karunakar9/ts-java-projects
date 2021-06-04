package advProg;

public class ChessKnight {

	public static void main(String[] args) {
		getChessKnightPlaces(4,4);
	}

	public static void getChessKnightPlaces(int row,int col) {int[][] chess = {{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1},{-2,1},{-1,2}};
	int count = 0;
	for(int i = 0;i < chess.length;i++){
		int newrow=0,newcol=0;
		for(int j = 0;j < chess[i].length;j++){
			if(j==0)
				newrow = row + chess[i][j];
			else
				newcol = col + chess[i][j];
			
		}
		if(((0 <= newrow) && (newrow <= 7)) && ((0 <= newcol) && (newcol <= 7))){
			System.out.println("("+newrow+","+newcol+")");
			count++;
		}
	}
	System.out.println(count);}

}
