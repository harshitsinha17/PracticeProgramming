package algoDS;
import java.util.*;

public class DistinctElementsinSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,1,2,1,2,3};
		int subSize = 3;
		int k = 0;
		
		Set<Integer> set = new HashSet<>();
		int total = 0;
		
		for(int i = 0;i<arr.length;) {
			if(k == subSize) {
				k = 0;
				total+=set.size();
				set.clear();
			}
			else {
				set.add(arr[i]);
				k++;
				i++;
			}
			
		}
		total+=set.size();
		set.clear();
		
		
		
		System.out.println("Total distict elements per k sub arrays "+total);
	}

}
