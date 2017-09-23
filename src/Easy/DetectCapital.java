package Easy;

public class DetectCapital {
	public static boolean detectCapitalUse(String word) {
		String str = word.substring(0,1) + word.substring(1, word.length()).toLowerCase();
		if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) || word.equals(str))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(detectCapitalUse("leetcode"));

	}

}
