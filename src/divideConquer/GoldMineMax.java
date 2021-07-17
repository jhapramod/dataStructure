package divideConquer;

public class GoldMineMax {

	public static void main(String[] args) {
		int gold[][]= { {1, 3, 1, 5}, 
						{2, 2, 4, 1}, 
						{5, 0, 2, 3}, 
						{0, 6, 1, 2} }; 
                  
		int m = 3, n = 3; 
  
		System.out.print(getMaxGold(gold, m, n)); 

	}

	private static int getMaxGold(int[][] gold, int row, int col) {
		int totalCost= Integer.MIN_VALUE;
		if(row==-1 || col ==-1)
			return totalCost;
		if(row==0 && col==0)
			return gold[0][0];
		
		int maxGold1 = getMaxGold(gold, row-1, col);
		int maxGold2 = getMaxGold(gold, row, col-1);
		
		int maxGold = Integer.max(maxGold1, maxGold2);
		int currentCost= gold[row][col];
		
		 totalCost = currentCost+maxGold;
		return totalCost;
	}

}
