package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		List<String> A = new ArrayList<String>();
		
		A.add("ha");
		A.add("pl");
		A.add("li");
		 
		Collections.sort(A, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				
				if ( arg0.charAt(0) == arg1.charAt(0) ) {
					if( arg0.charAt(1)<=arg1.charAt(0) ) {
						return 1;
					}
					else {
						return -1;
					}
				}
				else {
					return 1;
				}
				
			}
		});
		
		
		
		
		System.out.print(A);
	}

}
