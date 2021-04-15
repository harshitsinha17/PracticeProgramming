package NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

interface I{
	void add();
	default void show() {
		System.out.println("Hello inside I");
	}
}


public class MainFunction implements I {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		
		I obj =
			()->{
					System.out.println("Hello inside class add func");
					System.out.println("Hello inside class add func");
		};
		
		/*
		 * I objone = new I() { 
		 * public void add() {
		 * 
		 * }
		 * 
		 * };
		 */ 
		/*
		obj.show();
		
		
		List <String> val = new ArrayList<String>();
		val.add("hi1");
		
		val.add("ju");
		val.add("har1");
		
		val= val.parallelStream().filter(str->str.contains("1")).collect(Collectors.toList());
		for(String i : val) {
			System.out.println("******"+i);
		}
		
		/*
		 * val.forEach(v->{ v++; System.out.println(v); } );
		 */
		
		

	}
	
	public void demo() {
		show();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	

	
}
