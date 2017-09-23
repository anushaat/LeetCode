
public class CanPlaceFlowers605 {

	public static boolean canPlaceFlowers(int[] flowerbed, int n){
		int i=0, count=0;
		while(i<flowerbed.length){
			if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
				count++;
			}
			if(count>=n){
				return true;
			}
			i++;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,0,0,1,0,0};
		int n = 2;
		
		System.out.println(canPlaceFlowers(arr, n));

	}

}
