package Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {
	
	public static String[] findWords(String[] words) {
		HashSet<Character> set1 = new HashSet<>();
		set1.add('q');
		set1.add('w');
		set1.add('e');
		set1.add('r');
		set1.add('t');
		set1.add('y');
		set1.add('u');
		set1.add('i');
		set1.add('o');
		set1.add('p');
		
		HashSet<Character> set2 = new HashSet<>();
		set2.add('a');
		set2.add('s');
		set2.add('d');
		set2.add('f');
		set2.add('g');
		set2.add('h');
		set2.add('j');
		set2.add('k');
		set2.add('l');
		
		HashSet<Character> set3 = new HashSet<>();
		set3.add('z');
		set3.add('x');
		set3.add('c');
		set3.add('v');
		set3.add('b');
		set3.add('n');
		set3.add('m');
		
		ArrayList<String> list = new ArrayList<>();
		
		for(String word : words){
			char[] carr = word.toLowerCase().toCharArray();
			int len = carr.length;
			int count = 0;
			for(char c : carr){
				if(set1.contains(c)){
					count++;
				}
			}
			
			if(count == len){
				list.add(word);
			}
			
			count = 0;
			for(char c : carr){
				if(set2.contains(c)){
					count++;
				}
			}
			
			if(count == len){
				list.add(word);
			}
			
			count = 0;
			for(char c : carr){
				if(set3.contains(c)){
					count++;
				}
			}
			
			if(count == len){
				list.add(word);
			}
			
		}
		
		return list.toArray(new String[list.size()]);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(findWords(words));
	}

}
