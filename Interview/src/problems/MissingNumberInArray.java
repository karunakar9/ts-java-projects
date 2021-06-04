package problems;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int inputArr[]={1,2,3,4,5,7,8,9};
	
		int n=inputArr.length+1;
		
		
		int sumOfNumbers=sumOfAllNNumbers(n);
		

		int sumOfNumbersInGivenArray=sumOfAllNNumbersInGivenArray(inputArr);
		
		int missingNumber=sumOfNumbers-sumOfNumbersInGivenArray;
		
		System.out.println(missingNumber);
	}

	private static int sumOfAllNNumbersInGivenArray(int[] inputArr) {
		int sum=0;
		for (int i = 0; i < inputArr.length; i++) {
			sum=sum+inputArr[i];
		}
		return sum;
	}

	private static int sumOfAllNNumbers(int n) {
		int sum=(n*(n+1))/2;
		return sum;
	}

}
