package Medium;

public class CountingBits {
	
	public static int[] countBits(int num) {
		int[] numCount = new int[num+1];
		for(int i=1; i<=num; i++){
			numCount[i] = numCount[i>>1] + (i&1);
			System.out.println(i&1);
		}
		return numCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		int[] numCount = countBits(num);
		
		for (int i = 0; i < numCount.length; i++) {
			System.out.print(numCount[i] + " ");
		}

	}

}
