package Easy;

public class ReshapeTheMatrix {
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		
		int row = nums.length, col =nums[0].length;
		
		if(r*c != row*col){
			return nums;
		}
		
		int[][] arr = new int[r][c];
		
		for (int i = 0; i < r*c; i++) {
			arr[i/c][i%c] = nums[i/col][i%col];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nums = {{1,2},{3,4}};
		
		matrixReshape(nums, 1, 4);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			
		}
		

	}

}
