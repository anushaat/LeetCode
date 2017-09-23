package Easy;

public class FindTheWinner {
	
	public static String winner(int[] andrea, int[] maria, String s){
		int i=0, j = 0, aCount = 0 , mCount = 0;
	
		
		for(i = s.equals("Odd") ? 1 : 0; i<andrea.length; i+=2){
			for(j = s.equals("Odd") ? 1 : 0; j<maria.length; j+=2){
				aCount += andrea[i] - maria[j];
				mCount += -aCount;
			}
		}
		
		if(mCount>aCount){
			return "Maria";
		}else if(mCount<aCount){
			return "Andrea";
		}
		
		return "Tie";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] andrea = {1};
		int[] maria = {2};
		System.out.println(winner(andrea, maria, "Odd"));

	}

}
