package problems;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianModeOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		//
		double mean = meanOfArray(array);
		System.out.print(mean);

		double median = medianOfArray(array);
		System.out.print(median);

		int mode = modeOfArray(array);
		System.out.print(mode);
		scan.close();

	}

	private static int modeOfArray(int[] array) {
		Arrays.sort(array);
		int maxValue = 0, maxCount = 0, i, j, n = array.length;

		for (i = 0; i < n; ++i) {
			int count = 0;
			for (j = 0; j < n; ++j) {
				if (array[j] == array[i])
					++count;
			}

			if (count > maxCount) {
				maxCount = count;
				maxValue = array[i];
			}
		}
		return maxValue;

	}

	private static double medianOfArray(int[] array) {
		double result = 0;
		Arrays.sort(array);
		if (array.length % 2 == 0) {
			int mid = array.length / 2;
			result = (array[mid - 1] + array[mid]) / 2;
		} else {
			int mid = (array.length) / 2;
			result = array[mid];
		}
		return result;
	}

	private static double meanOfArray(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum / array.length;
	}

}
