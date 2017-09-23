package Easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine){
		int[] letterArray = new int[26];
		for(int i=0; i<magazine.length(); i++){
			letterArray[magazine.charAt(i)-'a']++;
		}
		
		for(int i=0; i<ransomNote.length(); i++){
			if(--letterArray[ransomNote.charAt(i) - 'a'] < 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
