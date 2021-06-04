package problems;

class MergeSort {

	public static void main(String args[]) {
		int arr[] = { 15, 5, 24, 8, 1, 3, 16, 10, 20 };

		sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array");
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}

	}
	
	// Main function that sorts arr[l..r] using
		// merge()
		static void sort(int arr[], int lb, int ub) {
			if (lb < ub) {
				// Find the middle point
				int m = (lb + ub) / 2;

				// Sort first and second halves
				sort(arr, lb, m);
				sort(arr, m + 1, ub);

				// Merge the sorted halves
				merge(arr, lb, m, ub);
			}
		}


	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int lb, int m, int ub) {
		
		// Find sizes of two subarrays to be merged
		int n1 = m - lb + 1;
		int n2 = ub - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[lb + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = lb;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			} else {
				arr[k] = R[j];
				j++;
				k++;
			}
			
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
}
