package dynamics;

public class CuttingRod {

	public static void main(String[] args) {
		 int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
	        int size = arr.length; 
	        System.out.println("Maximum Obtainable Value is "+ 
	                            cutRod(arr, size)); 
	}

	private static int cutRod(int[] price, int size) {
		if(size<=0)
		{
			
			return 0;
		}
		
		int max_value= Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			
			max_value =Math.max(max_value, price[i]+cutRod(price, size-i-1));
		}
		return max_value;
	}

	
}
