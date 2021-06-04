package trainmoPrograms;
/* input : hello
 * output:2
 */
public class CountvowelsInString {

	public static void main(String[] args) {
		String str =new String("hello");
		System.out.println(countingVowels(str));

	}
	public static int countingVowels(String str){
	int	count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
				count++;
		}
		return count;
	}

}
