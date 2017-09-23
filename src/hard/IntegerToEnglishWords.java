package hard;

import java.util.ArrayList;

public class IntegerToEnglishWords {
	
	//public static String numberToWords(int num){
		//String[] lessThan20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		//String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		//String[] thousands = {"", "Thousand", "Million", "Billion"};
		
		
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(8);
		
		ArrayList<Integer> a2 = (ArrayList<Integer>)al.clone();
		al.add(0, 3);
		al.remove(1);
		
		for(int i=0; i<al.size(); i++){
			System.out.print(al.get(i) + " ");
		}
		System.out.println(" List a2");
		for(int i=0; i<a2.size(); i++){
			System.out.print(a2.get(i) + " ");
		}
	}

}
