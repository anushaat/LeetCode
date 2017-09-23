package Easy;

public class ImplementStr {
	
//	public static int strStr(String haystack, String needle) {
//		if(haystack.contains(needle)){
//			return haystack.indexOf(needle);
//		}
//		return -1;
//	}
	
	public static int strStr(String haystack, String needle) {
		int hlen = haystack.length();
		int nlen = needle.length();
		
		if(nlen > hlen){
			return -1;
		}else if(nlen == 0){
			return 0;
		}
		int diff = hlen - nlen;
		
		for (int i = 0; i <= diff; i++) {
			if(haystack.substring(i, i+nlen).equals(needle)){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strStr("s", "s"));

	}

}
