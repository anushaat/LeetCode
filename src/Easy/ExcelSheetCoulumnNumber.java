package Easy;

public class ExcelSheetCoulumnNumber {
	
	public static int titleToNum(String s) {
		int n=0;
		for(int i=0;i<s.length();i++){
		    n = n*26+(s.charAt(i)-'@');
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		System.out.println(titleToNum(s));
		System.out.println(s.charAt(2));
	}

}
