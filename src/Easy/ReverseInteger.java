package Easy;

public class ReverseInteger {
	
	public static int reverse(int x) {
		int rev=0;
		
		while(x!=0){
			int temp = rev*10 + x%10;
			if(temp/10 != rev){
			    return 0;
			}
			rev = temp;
			x = x/10;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
	}

}
