package trainmoPrograms;

import java.util.Scanner;

public class SumOfLeastTwoNumInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		sumOfLeastNums(arr);
	}

	public static void sumOfLeastNums(int arr[]) {
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
		//	int current=arr[i];
			if (min1 > arr[i]) {
				min2 = min1;
				min1 = arr[i];
			} else if (min2 > arr[i] && arr[i] != min1) {
				min2 = arr[i];
			}

		}
		System.out.println("the least two numbers sum :"+min1+min2);
	//	System.out.println(min2);

	}

}
