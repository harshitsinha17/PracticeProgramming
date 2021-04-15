package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
class SortByLast implements Comparable<List<Integer>{

	public int compare(List<Integer> o1, List<Integer> o2) {
		// TODO Auto-generated method stub
		return (o1.get(0).compareTo(o2.get(0)));
		//return 0;
	}


	
}*/

public class compare {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> ls = new ArrayList<>();
		List<List <Integer>> inList = new ArrayList<>();
		ls.add(3);ls.add(5);
		inList.add(ls);
		List <Integer> ls1 = new ArrayList<>();
		ls1.clear();
		ls1.add(3);ls1.add(4);
		inList.add(ls1);
		
		/*
		System.out.println(inList);
		Collections.sort(inList, new Comparator<List<Integer>>() {
			public int compare(List<Integer> o1, List<Integer>o2) {
				if(o1.get(0) == o2.get(0)) {
					return o1.get(1).compareTo(o2.get(1));
				}
				else {
					return o1.get(0).compareTo(o2.get(0));	
				}
				
			}
		});
		*/
		
		
		
		/*Collections.sort(inList, new Comparator<List<Integer>>() {
			//@Override
			 public int compare(List<Integer> l1, List<Integer> o2) {
	            //Index 1 = second element
	            return o1.get(0).compareTo(o2.get(0));
	        }
		});
		*/
		

		System.out.println(inList);
		
		inList.sort(  (one, two)->{
			if(one.get(0)==two.get(0)) {
				if(one.get(1) > two.get(1)) {
					return 1;	
				}
				else {
					return -1;
				}
			}
			else {
				return -1;
			}
		} );
		
		
		
		System.out.println(inList);
	}

}
