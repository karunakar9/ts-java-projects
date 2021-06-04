
public class MCQEvaluation {

	public static void main(String[] args) {
		char a[]={'a','b','c','d','a','b','c','d','a'};
		char b[]={'a','b','b','d','a','b','c','b','a'};
		System.out.println(MCQEvaluation.evaluate(a,b));
		//System.out.println(MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','a'}));	

	}
	
	// 2 marks for right answer
	// No nagative marks
	
	public static int evaluate(char[] a, char[] b){
		// ADD YOUR CODE HERE
		if(a.length != b.length)
			return -1;
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(i==j){
					if(a[i]==b[j])
						count=count+2;
				}
					
			}
		}
		return count;
	}
}