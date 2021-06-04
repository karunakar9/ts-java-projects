package string.problems;

public class PrintingWholeStringUSingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="welcome to talent sprint";
		String arr[] = name.split(" ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
