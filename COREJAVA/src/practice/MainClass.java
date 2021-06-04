package practice;

class MainClass {
	public static void main(String[] args) {
		String option="||";
				
	    String JS_LOADER = "function loader() {\n"            
	            + "}\n"
	            + "var keyValuePairs = launchData.split(\"||\");\n"
	            + "customerId = getValue(\"customerId\", keyValuePairs);\n"
	            + "summaryMessages = summaryMessages + getTimestamp() + \" customerId = \" + customerId + \"<BR>\";\n"
	            + "\n"
	            + "summaryMessages = summaryMessages + getTimestamp() + \" Redirect url = \" + url + \"<BR>\";\n";
	    
	    System.out.println(JS_LOADER.replace("||", "&"));
//+ "var keyValuePairs = launchData.split(\"||\");\n"
	    //"var keyValuePairs = launchData.split("+option+");\n"
	}
}
