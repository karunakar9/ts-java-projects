package advProg;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern();

	}
	public static void getPattern(){
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print("1");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
