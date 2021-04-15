package java8;
import java.util.*;

public class OptionalImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = new String[4];
		str[3] = "hello";
		Optional<String> value = Optional.of(str[3]); //will throw Nullpointer exception if null is there
		
		str[3] = null;
		Optional<String> value2 = Optional.ofNullable(str[3]); //won't throw exception if null is there
		
		if(value.isPresent()) {
			System.out.println("value is present");
		}
		
		if(value2.isPresent()) {
			System.out.println("value 2 is present " + value2.get());
		}
		
		value.ifPresent(s->System.out.println("Inside get method with "+value.get()));
		System.out.println(value2.get());
		
		
	}

}
