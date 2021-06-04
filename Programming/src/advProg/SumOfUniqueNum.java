package advProg;

import java.util.Scanner;

public class SumOfUniqueNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size :");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(unique(arr));

	}

	public static int unique(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1)
				sum = sum + arr[i];
		}
		return sum;
	}

}
