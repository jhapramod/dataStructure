package dynamics;

public class MinimumCostToFillBag {

	public static void main(String[] args) {
		  int cost[] = {20, 10, 4, 50, 100}; 
	        int size = cost.length; 
	        System.out.println("Minimum Obtainable Value is "+ 
	        		minAmountToFillBag(cost, size)); 

	}

	private static int minAmountToFillBag(int[] price, int size) {
		if(size<=0)
			return 0;
		
		int min_value= Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			
			min_value =Math.min(min_value, price[i]+minAmountToFillBag(price, size-i-1));
		}
		return min_value;
	}

}
