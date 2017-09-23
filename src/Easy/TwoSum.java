package Easy;

public class TwoSum {
	
	public static int getSum(int a, int b) {
		int carry=0;
		while(b!=0){
			carry = a&b;
			a^=b;
			b=carry<<1;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getSum(10,3));

	}

}
