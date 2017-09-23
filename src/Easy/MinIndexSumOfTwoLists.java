package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class MinIndexSumOfTwoLists {
	
	public static String findRestaurant(String[] list1, String[] list2) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		int i=0, min=Integer.MAX_VALUE;
		String str = "";
		for(String str1 : list1){
			map1.put(str1, i++);
		}
		for (int j = 0; j < list2.length; j++) {
			if(map1.containsKey(list2[j])){
				int count = map1.get(list2[j])+j;
				map2.put(list2[j], count);
				if(count<=min){
					min=count;
					str=list2[j];
				}
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		
		System.out.println(findRestaurant(list1, list2));

	}

}
