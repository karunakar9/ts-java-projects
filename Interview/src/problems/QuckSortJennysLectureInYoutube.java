package problems;

public class QuckSortJennysLectureInYoutube {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 4, 3, 9 };
		int lb = 0;
		int ub = a.length - 1;
		quicksort(a, lb, ub);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void quicksort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int loc = partition(a, lb, ub);
			quicksort(a, lb, loc - 1);
			quicksort(a, loc + 1, ub);
		}

	}

	private static int partition(int[] a, int lb, int ub) {
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		while (start < end) {
			while (a[start] <= pivot) {
				start++;
			}
			while (a[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		int tempar = a[lb];
		a[lb] = a[end];
		a[end] = tempar;
		return end;
	}

}
