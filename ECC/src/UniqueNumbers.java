import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size :");
		int size = scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
	    unique(arr);
	}
	public static void unique(int arr[]){
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j])
					count++;
			}
			if(count ==1)
				System.out.println(arr[i]);
		}
	}

}

