package ModularProgramming;

public class AverageWordLength {

	public static void main(String[] args) {
		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
		System.out.println(AverageWordLength.getAverageWordLength("how are you"));
		String st="ab cd";
		System.out.println(st.length());

	}

	public static int getAverageWordLength(String str) {
		int count=0;
		int sum = 0;
		while(true){
			int charNum = str.length();
			sum = charNum+sum;
			count++;
		 int average =0;
		
			if(count>0){
				average =sum/count;
			}
			return average;
		}

		
	}

}