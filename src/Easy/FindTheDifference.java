package Easy;

public class FindTheDifference {
	
	public static char findTheDifference(String s, String t) {
		int[] ch = new int[256];
		char res = 'z';
		for(char c : s.toCharArray())
			ch[c]++;
		
		for (char c : t.toCharArray()) {
			if(ch[c]>0){
				ch[c]--;
			}else{
				res = c;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abecd";
		
		System.out.println(findTheDifference(s, t));
		

	}

}
