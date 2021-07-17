package divideConquer;

public class PrintAllPossibleWayToReachCell {

	public static void main(String[] args) {
		
		  int[][] mat = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7,
		  1, 7, 3, 7 }, { 2, 9, 8, 9, 3 } };
		 
		/*
		 * int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		 */
		
		
		int m=5, n=5;
	int maximiumPath=m+n-1;
		printAllPossiblePath(mat,m,n,0,0,new int[maximiumPath],0);

	}

	private static void printAllPossiblePath(int[][] mat, int m, int n, int i, int j, int[] path, int idx) {
		path[idx] = mat[i][j]; 
		if(i==m-1) {
			for (int k = j+1; k < n; k++) {
				
				path[idx+k-j]=mat[i][k];
			}
			for (int l = 0; l < idx+n-j; l++) {
				System.out.print(path[l]+" ");
			}
			System.out.println();
			return;
		}
		
		if(j==n-1) {
			for (int k = i+1; k < m; k++) {
				path[idx+k-i]=mat[k][j];
				
			}
			for (int l = 0; l < idx+m-i; l++) {
				System.out.print(path[l]+" ");
			}
			System.out.println();
			return;
		}
		
		printAllPossiblePath(mat,m,n,i+1,j,path,idx+1);
		
		printAllPossiblePath(mat,m,n,i,j+1,path,idx+1);
		
	}

}
