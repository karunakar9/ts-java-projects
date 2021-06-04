package advProg;

public class LargestPowerOf2InCollartzSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHighestPowerOf2(5));

	}

	public static int getHighestPowerOf2(int num) {
		return collartzSeq(num);

	}

	public static boolean isPowerOf2(int num) {
		double power=(Math.log10(num)/Math.log10(2));
		int intPower=(int) power;
		return (intPower==power);
		
	}

	public static int collartzSeq(int num) {
		while(num>2){
			if(isPowerOf2(num))
				return num;
			if(num%2==0)
				num=num/2;
			else
				num=num*3+1;
		}
		return 0;

	}
}