package divideConquer;

public class MinCostToTraverse {

	public static void main(String[] args) {
		int[][] cost =
			{
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
			};
		//System.out.print("The minimum cost is " +minCost(cost, cost.length-1, cost[0].length-1));
		
		int[][] traversarray = traverse(cost,  cost.length-1, cost[0].length-1);
		
		for (int i = 0; i < traversarray.length; i++) {
			
			for (int j = 0; j < traversarray[0].length; j++) {
				System.out.print(traversarray[i][j]);
			}
			System.out.println("");
			
			
		}
		
		
	}

	
	private static int minCost(int[][] cost,int row,int col) {
		
		int totalCost= Integer.MAX_VALUE;
		if(row==-1 || col ==-1)
			return totalCost;
		if(row==0 && col==0)
			return cost[0][0];
		
		
		int minCost1 = minCost(cost, row-1, col);
		int minCost2 =minCost(cost, row, col-1);
		int minCost = Integer.min(minCost1, minCost2);
		int currentCost= cost[row][col];
		
		 totalCost = currentCost+minCost;
		 
		 return totalCost;
	}
	
	
	private static int[][] traverse(int[][] cost,int row,int col) {
		int[][] traverseArray= new int[5][5];
		traverseArray[0][0]=0;
		
		if(row==-1 || col ==-1)	
			return traverseArray;
			
		if(row==0 && col==0)
			return traverseArray;
		
		
				traverseArray = traverse(cost, row-1, col);
				traverseArray[row][row]=cost[row][col];
				traverseArray =traverse(cost, row, col-1);
				traverseArray[row][row]=cost[row][col];
		
	
	
		 
		 return traverseArray;
	}
}
