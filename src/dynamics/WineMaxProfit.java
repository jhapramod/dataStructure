package dynamics;

public class WineMaxProfit {
	static int N = 1000;
	static int[][] dp = new int[N][N];

	public static void main(String[] args) {
		// Price array
		int price[] = { 2, 4, 6, 2, 5 };

		int n = price.length;
	
		int ans = maxProfit(price, 0, n - 1, n);

		System.out.println(ans);

	}

	private static int maxProfit(int[] price, int start, int end, int n) {
		
		int year = n - (end - start);
		if (start == end) {
			return year * price[start];
		}
		//There are two case either they start selling wine from start
		//Or they can start selling from end
		//Max of both will be the maximum profit of result
		int x = price[start] * year + maxProfit(price, start + 1, end, n);
		int y = price[end] * year + maxProfit(price, start,	end - 1, n);
		int ans = Math.max(x, y);
		//dp[start][end] = ans;
		return ans;

	}

}
