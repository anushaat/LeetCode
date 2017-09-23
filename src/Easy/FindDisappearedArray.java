package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedArray {
	
	public static List<Integer> findDisappearedArray(int[] nums) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int num = 	Math.abs(nums[i])-1;
			if(nums[num]>0){
				nums[num] = -nums[num];
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0){
				li.add(i+1);
			}
		}
		
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedArray(n));

	}

}
