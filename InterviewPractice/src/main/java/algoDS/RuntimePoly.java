package algoDS;

class A{
	public static void msg() {
		System.out.println("inside A-> parent");
	}
}

class B extends A{
	public static void msg() {
		System.out.println("insode B->Child");
	}
}

public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.msg();
		
		a = new B();
		B.msg();

	}

}
