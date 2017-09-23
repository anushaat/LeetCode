package Easy;

public class RemoveDupsFromSortedArray {
	
	public static int removeDuplicates(int[] nums) {
		int j = 0, len = nums.length;
		if(len == 0 || len == 1){
			return len;
		}
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] != nums[i+1]){
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[nums.length-1];
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		System.out.println(removeDuplicates(arr));
	}

}
