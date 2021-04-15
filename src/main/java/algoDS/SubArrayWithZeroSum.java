package algoDS;
import java.util.*;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {15,-2,2,-8,1,7,10,23};
		
		int sum =  0;
		int max = 0;
		Map<Integer, Integer> hp = new HashMap<>();
		
		for(int  i = 0;i<a.length;i++) {
			sum += a[i];
			
			if(sum == 0) {
				max = i+1;
			}
			
			if(hp.containsKey(sum)) {
				max = Math.max(max, i - hp.get(sum));
			}else {
				hp.put(sum, i);
			}
			
			
		}
		
		System.out.println(max);
	}

}
