package advProg;

public class NextPrime {

	public static void main(String[] args) {
		int i,j,start=15,end=100,count=0;
		for(i=start+1;i>0;i++){
			count=0;
			for(j=2;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				break;
			}
		}
		System.out.println(i);
	}

}
