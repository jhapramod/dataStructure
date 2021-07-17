package com.sabre.algo;

public class PermutationString {

	public static void main(String[] args) {
		 String str = "ABC"; 
	        int n = str.length(); 
	        PermutationString permutation = new PermutationString(); 
	        permutation.permute(str, 0, n); 

	}

	private void permute(String str, int low, int high) {
		
		if(low==high) {
		    System.out.println(str);
		}
		else {
			for (int i = low; i <high; i++) {
				str= swap(str,low,i);
				permute(str, low+1, high);
				str= swap(str,low,i);
				
			}
		}
		
	}

	private String swap(String str, int start, int end) {
		char temp;
		char[] temparr= str.toCharArray();
		temp= temparr[start];
		temparr[start] = temparr[end];
		temparr[end]=temp;
		return String.valueOf(temparr);
		
	}

}
