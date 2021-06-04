package simple.program;
import java.util.Scanner;

public class QuadraticSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(QuadraticSequence.getQuadricSequence(num));
		scan.close();
	

	}

	public static String getQuadricSequence(int n) {
		int sum=0;
		String str="";
		if(n<=0)
		return null;
		for(int i=1;i<=n;i++){
			sum=(sum+i);
			str=str+sum+",";
		}
		return str;
		
	}

}