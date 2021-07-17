package divideConquer;

public class LongestSubSequence {

	public static void main(String[] args) {
		System.out.println(findLongestSubSequence("elephant", "eretpat", 0, 0));

	}
	
	
	private static int findLongestSubSequence(String firstString,String secondString,int counter1,int counter2) {
		if(counter1==firstString.length()|| counter2==secondString.length())
			return 0;
		
		int firstLongestSequence=0;
		
		if(firstString.charAt(counter1)==secondString.charAt(counter2))
			firstLongestSequence=1+findLongestSubSequence(firstString, secondString, counter1+1, counter2+1);
		int secondCase =findLongestSubSequence(firstString, secondString, counter1+1, counter2);
		int thrirCase =findLongestSubSequence(firstString, secondString, counter1, counter2+1);
		
		
		return Math.max(firstLongestSequence, Math.max(secondCase, thrirCase));
					
	}
	
	
}
