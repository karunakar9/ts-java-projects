public class MaskEmailID01 {
    public static void main(String[] args) {
       String email = "testmail@mail.com";
       System.out.print(maskMailID(email));
      maskMailID(email);
    }

    public static String maskMailID(String email) {
    	String mask="";
    	int index =email.indexOf("@");
    	String endid=email.substring(index);
    	//System.out.println(endid);
    	int size=email.substring(2, index).length();
    	for( int i=0;i<size;i++){
    		mask=mask+"x";
    	}
    	mask=email.substring(0, 2)+mask+endid;
    	return mask;
    	
    	}

}
