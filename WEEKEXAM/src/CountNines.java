public class CountNines {
	public static void main(String[] args) {
		System.out.println(getCountNines(79, 99));

	}

	public static int getCountNines(int a, int b) {
		int count = 0, temp = 0, num = 0,Z=0;
		if(a>b){
			Z=a;
			a=b;
			b=Z;
		}
		if(a==0 || b==0){
			return -2;
		}
		if(a<0 || b<0){
			return -1;
		}
		for (int i = a; i <= b; i++) {
			temp = i;
			while (temp != 0) {
				num = temp % 10;
				if (num == 9) {
					count++;
				}
				temp /= 10;
			}

		}
		if (count == 0) {
			return -3;
		}
		return count;

	}

}