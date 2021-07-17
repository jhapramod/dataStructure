package greedy;

import java.util.Arrays;

public class MaximizeSumOFArray {

	public static void main(String[] args) {
		int arr[] = { -2, 1, 5, 1, 2,1 }; 
        int k = 5; 
       
        System.out.print(maximumSum(arr, k)); 

	}

	private static int maximumSum(int[] arr, int k) {
		int maximumSum=0;
		Arrays.sort(arr);
		
		for (int i = 0; i < k ; i++) {			
			if(arr[i]<0)
				arr[i]=-arr[i];
		
			
		}
		for (int j = 0; j < arr.length; j++) {
			maximumSum=maximumSum+arr[j];
		}
		return maximumSum;
	}

}
