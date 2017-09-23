package Medium;

public class FindDuplicate {
	
	public static int findDuplicate(int[] nums) {
		for(int i=0; i<nums.length; i++){
			int index = Math.abs(nums[i]);
			if(nums[index-1]<0){
				return index;
			}
			nums[index-1] = -nums[index-1];
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,1,1};
		System.out.println(findDuplicate(nums));

	}

}
