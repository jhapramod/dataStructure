package dynamics;

public class FibonacciDynamics {

	public static void main(String[] args) {
		System.out.println(fibonacciNumber(new int[9], 8));
		

	}
	
	private static int fibonacciNumber(int[] memoryFibStep,int fibNumber) {
		
		if(fibNumber==1)
			return 0;
		if(fibNumber==2)
			return 1;
		if(memoryFibStep[fibNumber]==0) 
			memoryFibStep[fibNumber]=fibonacciNumber(memoryFibStep, fibNumber-1)+fibonacciNumber(memoryFibStep, fibNumber-2);
		return memoryFibStep[fibNumber];
	}

}
