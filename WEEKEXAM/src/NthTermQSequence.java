
public class NthTermQSequence {

	public static void main(String[] args) {
		System.out.println(NthTermQSequence.getNthTerm(10));

	}

	public static int getNthTerm(int n) {
		if(n <=0){
			return -1;
		}
		int sum = 0, i;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

}