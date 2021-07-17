package common;

public class RemovalOfDuplicateString {

	public static void main(String[] args) {
		
        String inputString = "geeksforgeeks"; 
          
        System.out.println(unique(inputString)); 

	}

	private static String unique(String inputString) {
		String strb= new String();
		 int len = inputString.length(); 
		
		for (int i = 0; i <len; i++) {
			char charItem = inputString.charAt(i);
			
			if(strb.indexOf(charItem)<0) {
				strb+=charItem;
				
			}
			
		}
		
		
		return strb;
	}

}
