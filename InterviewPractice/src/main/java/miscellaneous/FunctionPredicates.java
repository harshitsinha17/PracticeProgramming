package miscellaneous;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class FunctionPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Predicate takes one argument and always return true/false
		Predicate<Integer> p1 = (i)->i%2 == 0;
		Predicate<Integer> p2 = (i)->i%7 == 0;
		
		System.out.println(p1.test(5));
		System.out.println(p1.or(p2).test(94) );
		
		
		//Functions
		Function<Integer, String> f1 = (i)->{
			if(i == 2) {
				return "Harshit";
			}
			else {
				return "Sinha";
			}
		};
		
		Function<Integer, String> f2 = (i)-> {
			return "Kumar";
		};
		
		System.out.println(f1.apply(3));
		System.out.println(f1.apply(2));
		//System.out.println( f1.andThen(f2).apply(5)) ;
		
		
		
		//Consumer-> it takes argument but does not return anything, like sysout
		Consumer<Integer> c1 = (i)-> System.out.println(i);
		
		Consumer<Integer> c2 = (j)->System.out.println(j*2);
		Consumer <Integer> c3 = c1.andThen(c2);
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(34);
		
		System.out.println("===== Consumer ======");
		
		for(Integer a : ls) {
			c1.accept(a);
		}
		 c3.accept(10);
		
		
		
		//Supplier -> Does not take input args but takes returning arg data type.
		 
		 Supplier<Integer> s1 = ()->{
			 int i  =2;
			 return i*2;
		 };
		 
		 System.out.println("===== Supplier =====");
		 
		 System.out.println(s1.get());
		 
		 
		 //Integers
		 IntPredicate inp1 = (i)->i==3;
		 inp1.test(5);
		 
		 IntFunction<String> infunc1 = (i)->{return "Looper";};
		 infunc1.apply(3);
		 
		 ToIntFunction<String> inf1 = (i)->2;
		 inf1.applyAsInt("harshit");
		 
		 IntConsumer inc1 = (i)->{System.out.println(i);};
		 inc1.accept(3);
		 
		 IntSupplier ins1 = ()->{return 1;};
		 ins1.getAsInt();
		 
		 
		  
		 
		
	
		

	}

}
