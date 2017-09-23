package Easy;

public class NumberComplement {
	
	public static int findComplement(int n) {
		return ~n & (Integer.highestOneBit(n)-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findComplement(5));

	}

}
