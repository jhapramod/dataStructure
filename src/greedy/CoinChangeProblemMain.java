package greedy;
import java.util.Arrays;

public class CoinChangeProblemMain {

	public static void main(String[] args) {
		int [] coins = {1, 2, 5, 10, 50, 100, 500,2000};
		int amount = 50;
		System.out.println("Coins available: "+Arrays.toString(coins));
		System.out.println("Target amount: "+ amount);
		CoinChangeProblem.coinChangeProblem(coins, amount);
		//System.out.println(5%2);
	}//end of method

}//end of class
