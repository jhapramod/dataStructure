package divideConquer;

public class MaximumProfit {

	public static void main(String[] args) {
		int[] profit= {31,26,72,17};
		int[] weight= {3,1,5,2};
		int capicity=7;

		System.out.println(maximumProfits(profit, weight, capicity, 0));
	}

	
	
	  private static int maximumProfits(int[] profit,int[] weight,int capacity,int currentIndex) 
	  
	  { 
		 if(capacity<=0|| currentIndex<0 || currentIndex >= profit.length) return 0; 
	 int profit1 = 0; 
	
	 if(weight[currentIndex] <= capacity) // 
		 
		 profit1 =profit[currentIndex]+  maximumProfits(profit,weight,capacity-weight[currentIndex],currentIndex+1);
	
	 int profit2 =maximumProfits(profit,weight,capacity,currentIndex+1);
	 
	 return Math.max(profit1, profit2); 
	 }
	 
	
	private static int knapsackAux(int[] profits, int[] weights, int capacity, int currentIndex) {
		if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length)//Base case
			return 0;

		int profit1 = 0;
		if (weights[currentIndex] <= capacity) // Taking current element
			profit1 = profits[currentIndex] + knapsackAux(profits, weights, capacity - weights[currentIndex], currentIndex + 1);

		int profit2 = knapsackAux(profits, weights, capacity, currentIndex + 1); // Not taking current element
		return Math.max(profit1, profit2);
	}//
}
