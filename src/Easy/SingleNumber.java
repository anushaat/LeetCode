package Easy;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
		int x=0;
		for (int i : nums)
			x^=i;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,1,3,2,3,1,3,3,4};
		System.out.println(singleNumber(nums));

	}

}
