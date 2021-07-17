package dynamics;

public class LongestSubString {
	static String firstString;
	static String secondString;
	static StringBuilder strb = new StringBuilder();
	public static void main(String[] args) {
		int n, m;
		firstString = "abcdxyz";
		secondString = "xyzabcd";

		n = firstString.length();
		m = secondString.length();

		System.out.println(longestSubString(n, m, 0));
		System.out.println(firstString.substring(0,4));

	}

	private static int longestSubString(int n, int m, int count) {
		if(n==0 || m==0) {
			return count;
			
		}
			
		if(firstString.charAt(n-1)==secondString.charAt(m-1)) {
			
			count=longestSubString( n-1, m-1, count+1);
		}
			
		count=Math.max(count,Math.max(longestSubString( n-1, m, 0),longestSubString(n, m-1, 0)));
		return count;
	}

}
