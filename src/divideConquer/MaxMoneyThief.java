package divideConquer;

public class MaxMoneyThief {

	public static void main(String[] args) {
	int[] houseWorth = {6,7,1,30,8,2,4};
	//int currentIndex=0;
	System.out.println(maxMoneyRecursive(houseWorth, 0));
		
	}
	
	/*
	 * private static int maxMoneyRecursive(int[] houseWorth,int currentIndex) {
	 * if(currentIndex>=houseWorth.length) return 0; int stealCurrentHouse =
	 * houseWorth[currentIndex]+maxMoneyRecursive(houseWorth, currentIndex+2); int
	 * skipCurrentHouse= houseWorth[currentIndex]+maxMoneyRecursive(houseWorth,
	 * currentIndex+1); return Math.max(stealCurrentHouse, skipCurrentHouse); }
	 */
	
	private static int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length) 
			return 0;

		int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex + 2);
		int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex + 1);

		return Math.max(stealCurrentHouse, skipCurrentHouse);
	}//end of method


}
