package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval{
	int start;
	int end;
	Interval(){start=0; end=0;}
	Interval(int s, int e){start = s; end = e;}
}

public class MergeIntervals {
	
	public static List<Interval> merge(List<Interval> intervals){
		int n = intervals.size();
		int[] startArr = new int[n];
		int[] endArr = new int[n];
		List<Interval> result = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			startArr[i] = intervals.get(i).start;
			endArr[i] = intervals.get(i).end;
		}
		Arrays.sort(startArr);
		Arrays.sort(endArr);
		
		for(int i=0, j=0; i<n; i++){
			if(i==n-1 || startArr[i+1] > endArr[j]){
				result.add(new Interval(startArr[j], endArr[i]));
				j = i+1;
			}
		}

		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
