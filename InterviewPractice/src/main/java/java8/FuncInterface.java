package java8;


interface A{
	public void m1();
	default void show() {
		System.out.println("This is a default method");
	}
}

class B implements A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside class B");
		
	}
	
	public void show() {
		System.out.println("Show Inside class B");
	}
	
	
}

public class FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Same output in both 
		 * 
		 * B obj  = new B();
		obj.m1();
		obj.show();
		*/
		
		A object = ()->{System.out.println("Lambda exp");};
		object.m1();
		object.show();
		
		
		// Same output because runtime poly is also done in 2nd
		B obj = new B();
		obj.m1();
		obj.show();
		
		A call = new B();
		call.m1();
		call.show();
	}

}
