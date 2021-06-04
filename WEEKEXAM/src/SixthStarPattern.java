
public class SixthStarPattern {

	public static void main(String[] args) {
		System.out.println(getStars(10));
		
	}

	public static String getStars(int n) {
		if(n <= 0)
			return "Error";
		String str = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				str = str + "*";
			}
			str=str+"\n";
		}
		// second loop
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				str = str + "*";
			}
			str=str+"\n";
		}
		return str;
	}
}
