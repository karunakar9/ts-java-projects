package problems;

public class MergeSortProgram {

	public static void main(String[] args) {
		int a[] = {15,5,24,8,1,3,20};
		int lb = 0;
		int ub = a.length - 1;
		MergeSortProgram obj = new MergeSortProgram();
		obj.mergesort(a, lb, ub);
	//	System.out.println(ub);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	void mergesort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;
			mergesort(a, lb, mid);
			mergesort(a, mid + 1, ub);
			merge(a, lb, mid, ub);
		}

	}

	void merge(int[] a, int lb, int mid, int ub) {
		int i = lb;
		int j = mid + 1;
		int k = lb;
		int b[] = new int[100];
		while (i <= mid && j <= ub) {
			if (a[i] <= a[j]) {
				b[k] = a[i];
				i++;
				k++;
			} else {
				b[k] = a[j];
				j++;
				k++;
			}
		}

		while (j <= ub) {
			b[k] = a[j];
			j++;
			k++;

		}

		while (i <= mid) {
			b[k] = a[i];
			i++;
			j++;

		}

		for (int l = lb; l <= ub; l++) {
			a[l] = b[l];
		}

	}

}
