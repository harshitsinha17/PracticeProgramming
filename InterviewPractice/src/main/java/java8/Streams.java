package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = Arrays.asList(new Integer[] {1,2,7,4,9});
		int sum1 = ls.stream().reduce(0, (sum,i)->sum+i);
		//ls.stream().collect(Collectors.)
		System.out.println(sum1);
		
		int max = ls.stream().max((i,j)->{return i<j?-1:1 ;}).get();
		System.out.println(max);
		
		List<String> lsTwo = new ArrayList<>();
		lsTwo.add("A");
		lsTwo.add("B");
		Iterator<String> itr = lsTwo.iterator();
		while(itr.hasNext()) {
			String a = itr.next();
			if(a.equals("A")) {
				itr.remove();
			}
		}
		
		System.out.println("=== after modification ===");
		System.out.println(lsTwo);
		

	}

}
