package Medium;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueSubstringsWrapText {
	public int findSubstringInWraproundString(String p) {
		int[] arr = new int[26];
		int max =0 ;
		for(int i=0; i<p.length(); i++){
			if(i>0 && (p.charAt(i) - p.charAt(i-1) == 1 || p.charAt(i-1) - p.charAt(i) == 25)){
				max++;
			}else{
				max = 1;
			}
			int index = p.charAt(i) - 'a';
			arr[index] = Math.max(arr[index], max);
		}
		
		int sum=0;
		for(int i=0; i<26; i++){
			sum += arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueSubstringsWrapText us = new UniqueSubstringsWrapText();
		System.out.println(us.findSubstringInWraproundString("zab"));
	}

}
