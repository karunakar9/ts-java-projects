package ModularProgramming;

import java.util.Scanner;

public class AttendanceForDetention {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of classes held :");
		int Numclass = scan.nextInt();
		System.out.println("Number of classes attended:");
        int Numattend = scan.nextInt();
        percentage(Numclass,Numattend);
        
	}
	public static void percentage(int Nclass,int Nattend){
		double per =(double)Nattend/Nclass*100;
		System.out.println(per+" is the percentage of student");
		if(per > 75)
			System.out.println("Student allowed to sit in the exam");
		else 
			System.out.println("student not allowed to sit in exam");
	}

}
