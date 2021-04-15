package algoDS;
import java.util.*;

public class SubArrayWithGivenSum {
	
	public static void takeSumOfSubArrays(List<Integer> list, int givenSum) {
		for(int i = 1;i<list.size();i++) {
			List<Integer> newList = list.subList(i, list.size());
			int total = newList.stream().reduce(0,(sum,j)->sum+j);
			if(total == givenSum) {
				System.out.println("Found "+newList);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> ls = new ArrayList<>();
		ls = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		List<Integer> ls1= new ArrayList<>();
		
		int sum = 0;
		int index= 0;
		int givenSum = 12;
		int start = 0;
		
		
		
		for(int i = 0;i<ls.size();i++) {
			
			sum = sum+ls.get(i);
			//ls1.add(ls.get(i));
			
			if(sum > givenSum) {
				
				
				takeSumOfSubArrays(ls.subList(start, i+1), givenSum);
				start = i;
				
			}
			
			
		}
		
	}

}
