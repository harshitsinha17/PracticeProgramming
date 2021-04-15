package miscellaneous;

interface abc{
	static int a=10;
	public void x();
	public static void fun() {
		
	}
}

public class Interfaces implements abc {

	//static int a = 20;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc ob = new Interfaces();
		
		
		Interfaces ob1 = new Interfaces();
		
		
		
		System.out.println(ob.a+" "+abc.a+" "+ob1.a);
		//ob1.fun(); //class's fun()
		abc.fun();
		// Interfaces.fun(); --> gives compile time error so fun was not inherited
		System.out.println(Interfaces.a);
		
		
		
		/*
		 * Anonymous class
		abc ob = new abc() {

			@Override
			public void x() {
				// TODO Auto-generated method stub
				
			}
			
		};
		*/
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

}
