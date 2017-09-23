package Easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
	
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<>();
		for (Integer num : nums) {
			while(!st.isEmpty() && st.peek()<num)
				map.put(st.pop(), num);
			st.push(num);
		}
		for (int i = 0; i < findNums.length; i++)
				findNums[i] = map.getOrDefault(findNums[i], -1);
		return findNums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] findNums = {4,1,2};
		int[] nums = {1,3,4,2};
		
		nextGreaterElement(findNums, nums);
		
		for (int i = 0; i < findNums.length; i++) {
			System.out.print(findNums[i] + " ");
		}

	}

}
