public class Box {
	public static void main(String[] args) {
		System.out.println(createBoxPattern(4, 5));
	}

	public static String createBoxPattern(int rows, int cols) {
		int i=0,j=0;
		String str="";
		while(i<cols){
			str=str+"*";
			i++;
		}
		for(i=2;i<rows;i++){
			for(j=cols;j<=cols;j++){
				str+="*";
			}

		}
		while(j<cols){
			str+="*";
			j++;
		}
		
		return str;

	}
}