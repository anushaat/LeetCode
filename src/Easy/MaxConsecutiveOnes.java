package Easy;

public class MaxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int[] nums){
		int count=0, max=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0)
				count=0;
			else{
				count++;
				if(count>max)
					max=count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0};
		System.out.println(findMaxConsecutiveOnes(nums));

	}

}
