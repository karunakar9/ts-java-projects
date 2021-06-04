package string.problems;

public class CountingWordsInString {

	public static void main(String[] args) {
		String name = new String("psr prime tower gachibowli");
		String arr[] = name.split(" ");
		System.out.println("Stringlenth :" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
