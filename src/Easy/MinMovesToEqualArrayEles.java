package Easy;

import java.util.Arrays;

public class MinMovesToEqualArrayEles {
	
	public static int minMoves(int[] nums){
		int minEle =Integer.MAX_VALUE, sum=0;
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
			if(nums[i]<minEle){
				minEle=nums[i];
			}
		}
		return sum - (minEle*nums.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		System.out.println(minMoves(nums));
		System.out.println(Integer.MAX_VALUE);
	}

}
