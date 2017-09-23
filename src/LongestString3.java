import java.util.HashMap;
import java.util.HashSet;


public class LongestString3 {
	
	public static int lengthOfLongestSubstring(String s){
		int max = 0, i = 0, j = 0;
		HashSet<Character> hs = new HashSet<>();
		while(i<s.length() && j<s.length()){
			if(!hs.contains(s.charAt(j))){
				hs.add(s.charAt(j++));
				max = Math.max(max, j-i);
			}
			
			else{
				hs.remove(s.charAt(i++));
			}
		}
		
		return max;
	}
	
	public static int lengthOfLongestSubstring2(String s){
		int max = 0;
		HashMap<Character, Integer> hs = new HashMap<>();
		for (int i = 0, j=0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if(hs.containsKey(c)){
				j  = Math.max(hs.get(c), j);
			}
			max = Math.max(max, i-j+1);
			hs.put(s.charAt(i),i+1);
			
		}
		return max;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring2("abc"));

	}

}
