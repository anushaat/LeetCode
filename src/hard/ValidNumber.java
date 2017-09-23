package hard;

public class ValidNumber {
	
	public static boolean isNumber(String s) {
		s = s.replaceAll("\\s+", "");
		if((s.isEmpty())){
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
