package Medium;

public class ShuffleAnArray {
	
	int[] nums;
	public ShuffleAnArray(int[] nums){
		this.nums = nums;
	}
	
	public int[] reset(){
		return nums;
	}
	
	public int[] shuffle(){
		int n = nums.length;
		int[] rand = new int[n];
		for(int i=0; i<n; i++){
			int r = (int)(Math.random()*(i+1));
			System.out.println(r);
			rand[i] = rand[r];
			rand[r] = nums[i];
		}
		return rand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		ShuffleAnArray saa = new ShuffleAnArray(nums);
		saa.shuffle();
		saa.reset();
	}

}
