package miscell;

class A{
	int var = 10;
	private static A obj = new A(2);
	
	private A(int a) {
		this.var = a;
	}
	
	public static A getObj() {
		return obj;
	}
	public void fun() {
		System.out.println("hello");
		System.out.println(obj.var);
	}
}

public class DesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A object =A.getObj();
		object.fun();
		System.out.println(object.var);

	}

}
