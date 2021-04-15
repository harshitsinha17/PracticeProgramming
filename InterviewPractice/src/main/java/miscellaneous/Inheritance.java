package miscellaneous;

class A{
	public int  i  = 1;
	static int a = 2;
	
	public static void fun() {
		System.out.println("A ===== ");
	}
	
	A(){
		
	}
}

class B extends A{
	//static int a =3;
	B( ){
		
		System.out.println(a);
		
	}
	
}

/*
class A{
	public int i = 1;
	
	A(int i){
		this.i  = i;
	}
}

/*
 * 
 * default contructor not available in parent A so, it will be compilation error
class B extends A{
	int i = 3;
	B(int i){
		this.i = i;
	}
}
*/


interface E{
	public void fun1();
	default void fun2() {
		System.out.println("Inside C interface");
	}
}

class F implements E{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Inside F fun1");
		
	}
	public void fun2() {
		System.out.println("Inside F fun2");
	}
	
}


class G{
	
	int a  = 4;
	public void walk() {
		System.out.println("Walking in class G");
	}
	
	public void running() {
		System.out.println("Running inside G");
	}
}

class H extends G{
	int a  = 5;
	public void walk() {
		System.out.println("walking inside H");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b =new B();
		B.fun();
		
		/////////////////////////////////////////////////////////////////////
		
		E c = new E() {

			@Override
			public void fun1() {
				// TODO Auto-generated method stub
				
				System.out.println("Inside object");
				
			}
			
		};
		
		c.fun2();
		
		E e = new F() {
			
		};
		e.fun1();
		e.fun2();
		
		///////////////////////////////////////////////////////////////////////
		
		
		G g = new H(); 
		g.walk();
		
		g.running();
		System.out.println(g.a); // g.a gives parent's a and not child's
		// Means Parent par = new Child(); by default has access to parent's function and fields
		// Runtime polymorphism is Not applicable on overriden fields and only overridden methods
		
		H h = new H();
		System.out.println(h.a);
		h.walk();
		h.running();

	}

}
