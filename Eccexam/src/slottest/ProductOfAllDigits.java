package slottest;

public class ProductOfAllDigits {

	public static void main(String[] args) {
		int num=126,last=1;
		while(num>0){
			int digit=num%10;
			 last=last*digit;
			num/=10;
		}
		System.out.println(last);

	}

}
