package com.sabre.algo;

public class RateMovement {

	static int N;
	public static void main(String[] args) {
		RateMovement rat = new RateMovement(); 
	        int maze[][] = { { 1, 0, 0, 0 }, 
	                         { 1, 1, 0, 1 }, 
	                         { 0, 1, 0, 0 }, 
	                         { 1, 1, 1, 1 } }; 
	        
	       
	  
	        N = maze.length; 
	        rat.solveMaze(maze); 
	}

	private boolean solveMaze(int[][] maze) {
		int[][] sol = new int[N][N];
		
		if(solveIssue(maze,0,0,sol)==false) {
			System.out.print("Solution doesn't exist"); 
            return false; 
		}
		
		printSolution(sol); 
        return true; 

	}
	
	  private boolean solveIssue(int[][] maze, int i, int j, int[][] sol) {
		  
		  if(i==N-1 && j==N-1) {
			  sol[i][j]=1;
			  return true;
		  }
		  if(IsSafe(maze,i,j)==true) {
			  sol[i][j] = 1;
			  
			  if(solveIssue(maze, i+1, j, sol)) {
				 return true;
			  }
			  if(solveIssue(maze, i, j+1, sol)) {
					 return true;
				  }
			  sol[i][j] = 0; 
	            return false; 
		  }
		
		return false;
	}

	private boolean IsSafe(int[][] maze, int i, int j) {
		return (i>=0 && i<N && j>=0 && j<N && maze[i][j]==1);
	}

	void printSolution(int sol[][]) 
	    { 
	        for (int i = 0; i < N; i++) { 
	            for (int j = 0; j < N; j++) 
	                System.out.print(" " + sol[i][j] + " "); 
	            System.out.println(); 
	        } 
	    } 

}
