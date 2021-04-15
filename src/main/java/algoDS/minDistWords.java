package algoDS;

import java.util.ArrayList;
import java.util.List;

public class minDistWords {
	
	public static int getMinDist(String sentence, String first, String second) {
		
		String words[] = sentence.split(" ");
		List<Integer> firstIndex = new ArrayList<>();
		boolean flagOne = false;
		List<Integer> secondIndex = new ArrayList<>();
		boolean flagTwo = false;
		
		int min  = Integer.MAX_VALUE;
		
		for(int i = 0;i<words.length;i++) {
			System.out.println("Before "+(i+1)+" iteration "+firstIndex+" "+secondIndex);
			if(words[i].equals(first) &&  (  !secondIndex.contains(i) &&  !firstIndex.contains(i) ) ) {
				firstIndex.add(i);
				flagOne = true;
			}
			else if(words[i].equals(second) && (  !secondIndex.contains(i) &&  !firstIndex.contains(i) )) {
				secondIndex.add(i);
				flagTwo = true;
			}
			
			if( (flagOne || flagTwo)  && (!firstIndex.isEmpty() && !secondIndex.isEmpty() ) ) {
				int currDist = Math.abs(  firstIndex.get(firstIndex.size()-1) - secondIndex.get(secondIndex.size()-1)  );
				if(currDist < min) {
					min = currDist;
				}
				flagOne=flagTwo=false;
			}
		}
		
		if (first.equals(second) && firstIndex.size() >1) {
			for(int  i = 0;i<firstIndex.size()-1;i++) {
				min = Math.min(min, firstIndex.get(i+1) - firstIndex.get(i));
			}
		}
		else if(first.equals(second) && firstIndex.size() == 1) {
			min = 0;
		}
		
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sentence = "Harshit is a good good boy Harshit And he is good boy";
		
		System.out.println(getMinDist(sentence, "boy", "Harshit"));

	}

}
