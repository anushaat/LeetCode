package Easy;

public class LastAndSecond {
	
	public static String lastLetters(String word){
		String str = word.substring(word.length()-1) + " " + word.substring(word.length()-2, word.length()-1);
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastLetters("HACK"));
	}

}
