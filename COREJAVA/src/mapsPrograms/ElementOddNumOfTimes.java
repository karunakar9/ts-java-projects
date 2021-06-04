package mapsPrograms;

import java.util.HashMap;
import java.util.Map;

public class ElementOddNumOfTimes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int arr[] = { 1, 1, 2, 1, 3, 2, 3, 4, 4, 3, 4, 4, 6 };
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
		oddCount(arr);

	}
	public static void oddCount(int arr[]){
		Map<Integer,Integer>map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				int value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}

}
