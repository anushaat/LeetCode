package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PalindromeCount {
	public static int countPal(String s){
		HashSet<String> set = new HashSet<>();
		if (s == null || s.length() == 0) return 0;
	        
	        for (int i = 0; i < s.length(); i++) { // i is the mid point
	            extendPalindrome(s, i, i, set); // odd length;
	            extendPalindrome(s, i, i + 1, set); // even length
	        }
	        
	        Iterator<String> it = set.iterator();
	        while(it.hasNext()){
	        	System.out.println(it.next());
	        }
	        
	        return set.size();
	        
    }
    
    private static void extendPalindrome(String s, int left, int right, HashSet<String> set) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            set.add(s.substring(left, right+1));
            left--; 
            right++;
        }
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPal("aabaa"));

	}

}
