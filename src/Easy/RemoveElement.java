package Easy;

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		int j=0;
		if(nums.length == 0){
			return 0;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val){
				nums[j++] = nums[i];
			}
		}
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,2,3,2,1};
		System.out.println(removeElement(arr, 3));

	}

}
