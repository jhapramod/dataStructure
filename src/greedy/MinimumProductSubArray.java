package greedy;

public class MinimumProductSubArray {

	public static void main(String[] args) {
		int a[] = { -1, -1, -2, 4, 3 }; 
        int n = 5; 
          
        System.out.println(minProductSubset(a, n)); 
        
  

	}

	private static int minProductSubset(int[] arrayElement, int n) {
		
		int postmin= Integer.MAX_VALUE;
		int negativeMx= Integer.MIN_VALUE;
		int product=1;
		int countZero=0;
		int negativeCount=0;
		
		for (int i = 0; i <n ; i++) {
			
			if(arrayElement[i]<0) {
				negativeCount++;
				negativeMx=Math.max(negativeMx, arrayElement[i]);
				
			}
			if(arrayElement[i]==0)
				countZero++;
			if(arrayElement[i]>0 && arrayElement[i]<postmin)
				postmin=arrayElement[i];
			
			product *=arrayElement[i];
			
						
		}
		
		if (countZero>1 && negativeCount==0) 
			return 0;
			
		
		if (negativeCount == 0) 
            return postmin;
		 if (negativeCount % 2 == 0 && negativeCount != 0) 
	        { 
	      
	            // Otherwise result is product of 
	            // all non-zeros divided by maximum 
	            // valued negative. 
	            product = product / negativeMx; 
	        } 
		
		return product;
	}

}
