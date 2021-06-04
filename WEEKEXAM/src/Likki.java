import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Likki {

	public static void main(String[] args) {
		int select1=1;
		int select2=0;
		int select3=0;
		float amount=0;
		if(select1==1) {
			amount=10000;
		}
		if(select1==2) {
			amount=7000;
		}
		if(select1==3) {
			amount=6000;
		}
		else if(select2==1 & select3==1) {
			amount=(float) (amount+amount*0.2);
		}
		else if(select2==1 & select3==2) {
			amount=(float) (amount+amount*0.02);
		}
		else if(select2==2 & select3==1 ||select3==2) {
			amount=amount;
		}
		System.out.println(amount);
		
	}

}
