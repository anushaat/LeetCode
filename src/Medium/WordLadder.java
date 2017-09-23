package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordNode{
	String word;
	int numOfSteps;
	
	public WordNode(String word, int numOfSteps){
		this.word = word;
		this.numOfSteps = numOfSteps;
	}
}

public class WordLadder {
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList){
		Queue<WordNode> queue = new LinkedList<>();
		queue.add(new WordNode(beginWord, 1));
		wordList.add(endWord);
		
		while(!queue.isEmpty()){
			WordNode top = queue.poll();
			String word = top.word;
			
			if(word.equals(endWord)){
				return top.numOfSteps;
			}
			char[] arr = word.toCharArray();
			for(int i=0; i<arr.length; i++){
				for(char c='a'; c<='z'; c++){
					char temp = arr[i];
					if(arr[i] != c){
						arr[i] = c;
					}
					
					String newWord = String.valueOf(arr);
					if(wordList.contains(newWord)){
						queue.add(new WordNode(newWord, top.numOfSteps+1));
						wordList.remove(newWord);
					}
					arr[i] = temp;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordLadder wl = new WordLadder();
		List<String> li = new ArrayList<>();
		li.add("hot");
		li.add("dot");
		li.add("dog");
		li.add("lot");
		li.add("log");
		System.out.println(wl.ladderLength("hit", "cog", li));

	}

}
