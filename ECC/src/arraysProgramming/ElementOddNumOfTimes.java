package arraysProgramming;

public class ElementOddNumOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int arr[] = { 6,1, 1, 2, 1, 3, 2, 3, 4, 4, 3, 4, 4, 6,4 ,6};
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0)
				System.out.println(arr[i]);

		}

	}

}
