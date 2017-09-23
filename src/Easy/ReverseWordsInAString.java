package Easy;

public class ReverseWordsInAString {
	
	public static String reverseWords(String s) {
		
		char[] c = s.toCharArray();
		int i=0;
		for (int j = 0; j < c.length; j++) {
			if(c[j] == ' '){
				reverse(c, i, j-1);
				i = j+1;
			}
		}
		
		reverse(c, i, c.length-1);
		return new String(c);
	}
	
	public static void reverse(char[] c, int i, int j) {
		while(i<j){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));

	}

}
