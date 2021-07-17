package greedy;

import java.util.Arrays;

public class MaximumSum {

	public static void main(String[] args) {
		
		 int arrayData[] = { 3, 5, 6, 1 }; 
		
		System.out.println(maximumSummOfArray(arrayData));
		

	}

	private static int maximumSummOfArray(int[] arrayData) {
			Arrays.sort(arrayData);
			int sum=0;
			
			for(int i=0;i<arrayData.length;i++) {
				
				sum=sum+arrayData[i]*i;
			}
		return sum;
	}

}
