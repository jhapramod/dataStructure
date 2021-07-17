package greedy;
import java.util.Arrays;

public class CoinChangeProblem {
	static void coinChangeProblem(int [] coins, int N) {
		
	Arrays.sort(coins);
	
	int index = coins.length-1;
	while(N!=0) {
		
		int coinIndex = coins[index];
		index--;
		int maxAmount = (N/coinIndex)*coinIndex;
		if(maxAmount>0) {
		System.out.println("coin has been "+ coinIndex + " taken count "+(N/coinIndex));
		
			N=N-maxAmount;
		}
	}
	}//end of method

}//end of class
