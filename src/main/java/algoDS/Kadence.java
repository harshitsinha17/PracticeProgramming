package algoDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kadence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> ls = new ArrayList<>();
		
		ls = Arrays.asList(-2, -5, 6, -2, -3, 1, 5, -6);
		List<Integer> po = new ArrayList<>();
		int sum = 0;
		int max = -10000;
		int index  = 0;
		
		for( int i = 0;i<ls.size();i++) {
			
			sum = sum+ls.get(i);
			if(sum <0) {
				po.add(i);
				sum =0;
			}
			else {
				if(max < sum) {
					index  = i;
					max = sum;
				}
			}
		}
		System.out.println(po);;
		System.out.println(max+" "+index);
	}

}
