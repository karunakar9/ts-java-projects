import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxSpan {
	public static int findMaxFrequency(int[] arr) {
		int count1=0,i;
		for ( i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j]){
					count1++;
				}
				
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = { 1,1,1,1,1,1, 2, 2, 3,3,3,3 };
		System.out.println(findMaxFrequency(arr));
	}
}