package problems;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		Integer[]  rollNumber = { 23, 17, 20, 29, 30 };
	    /* Index below is greater than the size 
	    of the given Array */
	    //int element = rollNumber[6];
		Arrays.sort(rollNumber);
	    for (int temp : rollNumber)
	        System.out.print(temp+" ");

	}

}
