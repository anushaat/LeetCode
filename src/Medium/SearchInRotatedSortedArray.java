package Medium;

public class SearchInRotatedSortedArray {
	
	public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<right){
        	int mid = (left+right)/2;
        	if(nums[mid]==target){
        		return mid;
        	}
        	if(nums[left]<=nums[mid]){
        		if(target<nums[mid] && target>=nums[left]){
        			right = mid-1;
        		}else{
        			left = mid+1;
        		}
        	}else{
        		if(target>nums[mid] && target<=nums[right]){
        			left = mid+1;
        		}else{
        			right = mid-1;
        		}	
        	}
        }
        return nums[left] == target && nums.length>0 ? left:-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,9,10,20,0,1,2,3};
		SearchInRotatedSortedArray searchArr = new SearchInRotatedSortedArray();
		System.out.println(searchArr.search(nums, 20));
	}

}
