
public class FindSecondMaxDigit {

	public static int findSecondMaxDigit(int numb)
	{
		if(numb<= 0){
			return -1;
		}

		int max1 = 0, max2 = 0;
		while (numb > 0) {
			int digit = numb % 10;
			if (max1 < digit) {
				max2 = max1;
				max1 = digit;
			} else if (max2 < digit && max1 != digit) {
				max2 = digit;
			}
			numb = numb / 10;
		}
		
		 
	
		return max2;
	}
	public static void main(String[] args) {		
		System.out.println(findSecondMaxDigit(12345));
	}
}