package common;

public class PermutationString {
	
	public static void permuteString(String str,String ans) {
		if(str.length()==0) {
			System.out.println("permuted string \t"+ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			
			char ch =str.charAt(i);
			String ros =  str.substring(0,i)+ str.substring(i+1);
			permuteString(ros, ans+ch);
		}
	}

	public static void main(String[] args) {
		permuteString("abc", "");
		
	}

}
