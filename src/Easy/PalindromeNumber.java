package Easy;

public class PalindromeNumber {
	
	public static int isPalindrome(int x){
		int res=0, temp = x;
		while(x!=0){
			res = x%10 + res*10;
			x = x/10;
		}
		
		return res;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-2147447412));
	}

}
