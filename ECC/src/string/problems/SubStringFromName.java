package string.problems;

public class SubStringFromName {

	public static void main(String[] args) {
		String name="amar akbar antony";
		int index1=name.indexOf(" ");
        int index2=name.lastIndexOf(" ");
        System.out.println(name.substring(0, index1));
        System.out.println(name.substring(index1+1,index2 ));//incrementing by 1
        System.out.println(name.substring(++index2));//incrementing
        
        
	}

}
