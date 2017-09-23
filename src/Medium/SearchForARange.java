package Medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchForARange {
	
	public int[] searchRange(int[] nums, int target){
		List<Integer> list = new ArrayList<>();
		searchRange(nums, list, 0, nums.length-1, target);
		Iterator it = list.iterator();
		int[] arr = new int[list.size()];
		int i=0;
		while(it.hasNext()){
			arr[i] = (int)it.next();
			i++;
		}
		
		return arr;
	}
	
	public void searchRange(int[] nums, List<Integer> list, int left, int right, int target){
		if(left>=right) return;
		
		if(nums[left] == target){
			list.add(left);
		}
		int mid = (left+right)/2;
		
		searchRange(nums, list, left, mid, target);
		searchRange(nums, list, mid+1, right, target);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchForARange sr = new SearchForARange();
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] arr = sr.searchRange(nums, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
