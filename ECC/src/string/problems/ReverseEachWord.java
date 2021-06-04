package string.problems;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "talent sprint";
		reverseWord(str);
	}

	public static void reverseWord(String str) {
		String str1 = "";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			str1 = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				str1 = str1 + arr[i].charAt(j);
			}
			System.out.print(str1+" ");
		}
	}
}
