package common;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		  String s1 = "AGGTAB"; 
		   String s2 = "GXTXAYB"; 
		   
		   char[] char1=s1.toCharArray();
		   char[] char2 =s2.toCharArray();
		   
		   int firstLenght=s1.length();
		   int secondLenght=s2.length();
		   
		   System.out.println(commonCountLength(char1,char2,firstLenght,secondLenght));
		   
		  //commonCountLength(char1,char2,firstLenght,secondLenght);
	}

	private static int commonCountLength(char[] char1, char[] char2, int firstLenght, int secondLenght) {
		
		if(firstLenght==0 || secondLenght==0)
			return 0;
		
		if(char1[firstLenght-1]==char2[secondLenght-1])
			return 1+commonCountLength(char1, char2, firstLenght-1, secondLenght-1);
		else	
		return Math.max(commonCountLength(char1, char2, firstLenght-1, secondLenght), commonCountLength(char1, char2, firstLenght, secondLenght-1));
		
	}

}
