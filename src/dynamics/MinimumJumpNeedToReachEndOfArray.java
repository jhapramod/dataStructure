package dynamics;

public class MinimumJumpNeedToReachEndOfArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 1, 0, 9 };
		int n = arr.length;
		System.out.print("Minimum number of jumps to reach end is " + minJumps(arr, n));

	}

	private static int minJumps(int[] arr, int n) {
		int[] min_num_array = new int[n];

		for (int i = 1; i < n; i++) {
			min_num_array[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (i <= j + arr[j]) {
					min_num_array[i] = Integer.min(min_num_array[i], min_num_array[j] + 1);
				}

			}
		

		}
		return min_num_array[n - 1];
	}

}
