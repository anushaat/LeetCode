package Easy;

public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
