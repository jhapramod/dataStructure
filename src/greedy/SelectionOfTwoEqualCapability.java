package greedy;

import java.util.Arrays;

public class SelectionOfTwoEqualCapability {

	public static void main(String[] args) {
		int element[] = { 1, 1, 1, 1,1,3,2,3 }; 
		
		System.out.println(findGroupWithLeastTwoSamePoint(element));

	}

	private static int findGroupWithLeastTwoSamePoint(int[] element) {
		
		Arrays.sort(element);
		int maximumGroup=0;
		
		for (int i = 0; i < element.length;) {
			if(element[i]==element[i+1]) {
				maximumGroup++;
				i+=2;			
			}
				
			
		}
		return maximumGroup;
	}

}
