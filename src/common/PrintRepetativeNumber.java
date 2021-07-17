package common;

public class PrintRepetativeNumber {

	public static void main(String[] args) {
		PrintRepetativeNumber duplicate = new PrintRepetativeNumber(); 
	        int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
	        int arr_size = arr.length; 
	  
	        duplicate.printRepeating(arr, arr_size); 
	}

	private void printRepeating(int[] arr, int arr_size) {
		
		for(int i=0;i<arr_size;i++) {
			
			
			if(arr[Math.abs(arr[i])]>0) {
				
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}else {
				System.out.println("Duplicate element "+Math.abs(arr[i]));
			}
		}
		
	}

}
