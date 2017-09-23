package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class DistributeCandies {
	
	public static int distributeCandies(int[] candies) {
		
		HashSet<Integer> map = new HashSet<>();
		
		int maxDiff = candies.length/2;
		for (int i : candies) {
			map.add(i);
		}
		
		if(map.size()>maxDiff){
			return maxDiff;
		}
	
		return map.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,1};
		System.out.println(distributeCandies(arr));

	}

}
