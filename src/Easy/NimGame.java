package Easy;

public class NimGame {
	
	public static boolean canWinNim(int n) {
		return n%4 == 0 ? false: true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canWinNim(3));
	}

}
