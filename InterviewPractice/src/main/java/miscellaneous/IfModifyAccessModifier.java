package miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class C{
	protected int a;
	C(){
		a = 2;
	}
}

//private fields are not inherited
//access modifier can be changed i.e if in parent protected then public/default in child
class D extends C{
	//public int a;
	
	D(){
		System.out.println(a);
	}
}

public class IfModifyAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new D().a);
		
		/*
		 * List<Integer> ls = Arrays.asList(new Integer[]{1,24,3}); Collections.sort(ls,
		 * (o1,o2)->{ if(o1<o2) { return 1; } else { return -1; } });
		 * 
		 * Collections.sort(ls, new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return 0; }
		 * 
		 * });
		 */
	}

}
