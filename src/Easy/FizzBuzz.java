package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static List<String> fizzBuzz(int n){
		List<String> li = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			
			if(i%15 == 0){
				li.add("FizzBuzz");
			}
			else if(i%3 == 0){
				li.add("Fizz");
			}
			else if(i%5 == 0){
				li.add("Buzz");
			}
			else{
				li.add(String.valueOf(i));
			}
		}
		return li;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15).toString());
	}

}
