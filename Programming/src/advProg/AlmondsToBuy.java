package advProg;

public class AlmondsToBuy {

	public static void main(String[] args) {
		System.out.println(" buy almonds  for N(input) days. : " + getAlmonds(6));

	}

	public static int getAlmonds(int n) {
		int i, day1 = 2, day2 = 3, day3 = 5, nthDay = 0,sum=0;
		for (i = 4; i <= n; i++) {
			nthDay = day1 + day2 + day3;
			day1 = day2;
			day2 = day3;
			day3 = nthDay;
			sum=sum+nthDay;
		}
		 return sum+10;
		 

	}

}
