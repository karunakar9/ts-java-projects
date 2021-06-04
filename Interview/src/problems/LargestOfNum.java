package problems;

public class LargestOfNum {

	public static void main(String[] arg){
		int a=6;
		int b=4;
		int c=2;
		int d=23;
		int e=12;
		
	int max=a;
	if(a<b)
		max=b;
	if(max<c)
		max=c;
	if(max<d)
		max=d;
	if(max<e)
		max=e;
	System.out.println(max);
	}
}
