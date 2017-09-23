package Easy;

import java.util.Arrays;

public class ArrayPartition {
	
	public static int arrayPartition(int[] arr) {
		
		int n = arr.length;
		int sum =0;
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			sum+= Math.min(arr[i], arr[i+1]);
			i++;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 3, 2, 6, 8, 5, 9};
		System.out.println(arrayPartition(arr));

	}

}
