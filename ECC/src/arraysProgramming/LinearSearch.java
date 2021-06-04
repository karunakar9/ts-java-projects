package arraysProgramming;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size  and search element:");
		int size = scan.nextInt();
		int num = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("search element is found: " + linearsearchAelement(arr, num));

		scan.close();
	}

	public static boolean linearsearchAelement(int arr[], int search) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search){
				flag=1;
			     break;
			}
		}
		if(flag==1)
		return true;
		return false;

	}
}
