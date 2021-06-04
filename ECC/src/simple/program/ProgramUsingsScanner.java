package simple.program;

import java.util.Scanner;

public class ProgramUsingsScanner {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the input:");
		int num =scan.nextInt();
		System.out.println("entered  input is :" +num);
				
				System.out.println("enter  the decimal input:");
				double d =scan.nextDouble();
				System.out.println("entered  input is :" +d);
				
				scan.nextLine();
						System.out.println("enter  the  input  line:");
						String str =scan.nextLine();
						System.out.println("entered  input is :" +str);
						scan.close();
						
	} 

}
