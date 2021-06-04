package string.problems;
/*input   :   a-b-c
 * output :   --abc
 */
public class Rearrangement {

	public static void main(String[] args) {
		String str = "a-b-c";
		System.out.println(convert(str));

	}
	public static String convert(String str){
		String letter="",symbol="",result="";
		for (int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if (Character.isAlphabetic(c)){
		        letter=letter+str.charAt(i);
			}
		        else 
		        	symbol = symbol+str.charAt(i);
			
		}
		result=symbol + letter;
		return result;

	}

}
