package trainmoPrograms;

import java.util.Scanner;

public class NtermsInfibbonacci {

	public static void main(String[] args) {
		// WAP to print n terms in Fibonacci Series.
		Scanner scan = new Scanner(System.in);
		int nTerms = scan.nextInt();
		fibbonacciNterms(nTerms);
	}
      public static void fibbonacciNterms(int Nterms){
    	  int a=0, b=1,c,i;
    	for(i=0;i<Nterms;i++){
          System.out.println(a);
    		c=a+b;
    		a=b;
    		b=c;
    	}
    	  
      }
}
