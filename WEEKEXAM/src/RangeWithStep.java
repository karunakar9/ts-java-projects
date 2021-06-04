public class RangeWithStep {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 20;
        int step = 23;
        System.out.println(getNumbersInRange(n1, n2, 1)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		if(num1<0 || num2<0 || step<0)
			return "-1";
		if(num1 ==num2)
			return "-2";
		if(num1 >num2)
			return "-3";
		String str="";
		for (int i = num1; i < num2; i++) {
		int temp=i+step;
		str=str+temp+" ";
		}
		return str;
	   
	}
}