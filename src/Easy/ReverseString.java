package Easy;

public class ReverseString {
	//Memory limit exceeded
	public static String reverseString(String s){
		if(s.length()<=1){
			return s;
		}
		return reverseString(s.substring(1))+s.charAt(0);
	}
	
	public static String reverseString2(String s){
//		int len = s.length();
//		if(len<=1){
//			return s;
//		}
//		
//		String left = s.substring(0, len/2);
//		String right = s.substring(len/2, len);
//		return reverseString(right)+reverseString(left);
		
		int len = s.length();
		if(len<=1){
			return s;
		}
		
		String left = s.substring(0, len/4);
		String lc = s.substring(len/4, len/2);
		String rc = s.substring(len/2, 3*len/4);
		String right = s.substring(3*len/4, len);
		return reverseString(right)+reverseString(rc)+reverseString(lc)+reverseString(left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println(reverseString2("abcdef"));
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime-startTime);
		
	}

}
