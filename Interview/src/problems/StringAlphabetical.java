package problems;

public class StringAlphabetical {

	public static void main(String[] args) {
		String str="karunakar";
		char[] charStr=str.toCharArray();
		char temp;
		for(int i=0;i<charStr.length-1;i++){
			 for (int j = 0; j < charStr.length-1; j++) {
				if(charStr[j+1]<charStr[j]){
					temp=charStr[j];
					charStr[j]=charStr[j+1];
					charStr[j+1]=temp;
				}
			}
		}
for (int i = 0; i < charStr.length; i++) {
	System.out.println(charStr[i]);
}
		
	}

}
