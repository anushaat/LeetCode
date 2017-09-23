package Easy;

public class TwoSumII {
	
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    if(numbers==null || numbers.length<2){
	    	return result;
	    }
		int left=0, right = numbers.length-1;
		while(left<right){
			int res = numbers[left] + numbers[right];
			if(res == target){
				result[0] = left+1;
				result[1] = right+1;
				break;
			}else if(res>target){
				right--;
			}else{
				left++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoSumII ts = new TwoSumII();
		int[] numbers = {2,7,11,15};
		int[] result = new int[2];
		result = ts.twoSum(numbers, 18);
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}

	}

}
