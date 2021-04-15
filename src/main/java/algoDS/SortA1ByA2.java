package algoDS;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class SortA1ByA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {2,1,2,5,7,1,9,3,6,8,8};
		
		List<Integer> ls1 = new ArrayList<>();
		List<Integer> ls2 = new ArrayList<>();
		
		ls1 =  new ArrayList<> (Arrays.stream(a).boxed().collect(Collectors.toList()) );
		
		int b[] = {2,1,8,3};
		//2 2 1 1 8 8 3 5 6 7 9
		
		Map<Integer, Integer> hp = new HashMap<>();
		
		Iterator itr = ls2.iterator();
		for(int i = 0;i<b.length;) {
			if(ls1.contains(b[i])) {
				ls2.add(b[i]);
				System.out.println("Removing");
				ls1.set(ls1.indexOf(b[i]), -100);
			}
			else {
				i++;
			}
		}
		
		System.out.println(ls2);
		
		for(int i = 0;i<a.length;i++) {
			if(ls1.get(i) != -100)
				ls2.add(a[i]);
		}

		
		System.out.println(ls2);
	}

}
