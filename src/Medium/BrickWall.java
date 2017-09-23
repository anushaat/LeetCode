package Medium;

import java.util.HashMap;
import java.util.List;

public class BrickWall {
	
	public int leastBricks(List<List<Integer>> wall){
		int count=Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(List<Integer> row : wall){
			int sum=0;
			for(int i=0; i<row.size()-1; i++){
				sum+=row.get(i);
				if(map.containsKey(sum)){
					map.put(sum, map.get(sum) + 1);
				}else{
					map.put(sum, 1);
				}
			}
		}
		for(int values : map.values()){
			count = Math.max(count, values);
		}
		return wall.size() - count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
