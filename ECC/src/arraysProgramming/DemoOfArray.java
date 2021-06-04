package arraysProgramming;

import java.util.Scanner;

public class DemoOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements ;");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("average of numbers: "+avgOfMarks(arr));
		scan.close();
	
	}
	public static int avgOfMarks(int arr[]){
		int avg=0;
	for(int i=0;i<arr.length;i++){
		avg = avg + arr[i];
	}
		return avg/arr.length;
	}

}
