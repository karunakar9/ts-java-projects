public class SumOfArrayDistinctElements {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(getSumOfDistinctElements(arr));
	}

	// return the sum of distinct elements of an given array
	public static int getSumOfDistinctElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				return -1;
			else if (arr[i] == 0)
				return -2;
			else if (!isDublicate(arr, arr[i])) {
				sum = sum + arr[i];
			}
		}

		return sum;
	}

	// return true if the value exist more than once in the array
	public static boolean isDublicate(int[] arr, int val) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				count++;
			}
		}
		if (count > 1) {
			return true;
		}

		return false;
	}
}