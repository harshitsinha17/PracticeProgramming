package java8;

interface inter{
	public void m1();
	public void m2();
	static void m3() {
		System.out.println("in interface static");
	}
}


//default methods can be overridden
//static methods cannot be overridden
public class InterfaceImpl implements inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inter obj = new InterfaceImpl();
		InterfaceImpl.m3();
		inter.m3();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void m3() {
		System.out.println("Inside class static m3");
	}

}
