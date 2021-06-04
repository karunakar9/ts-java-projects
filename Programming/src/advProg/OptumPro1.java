package advProg;

import java.util.Scanner;

public class OptumPro1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println(getRequiredOutput(n));

	}

	private static int getRequiredOutput(int n) {
		int digit=0;
		int sum=0;
		while(n>0){
			digit=n%10;
			if(digit==0){
				sum=sum*10+9;
			}
			if(digit==1){
				sum=sum*10+8;
			}
			if(digit==2){
				sum=sum*10+7;
			}
			if(digit==3){
				sum=sum*10+6;
			}
			if(digit==4){
				sum=sum*10+5;
			}
			if(digit==5){
				sum=sum*10+4;
			}
			if(digit==0){
				sum=sum*10+9;
			}
			if(digit==6){
				sum=sum*10+3;
			}
			if(digit==7){
				sum=sum*10+2;
		}
			if(digit==8){
				sum=sum*10+1;
			}
			if(digit==9){
				sum=sum*10+0;
			}
			n=n/10;
		}
		
		int dig=0;
		int rev=0;
		while(sum>0){
			dig=sum%10;
			rev=rev*10+dig;
			sum=sum/10;
		}

		return rev;
	}

}
