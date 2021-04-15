package miscell;

class B{
	//int var = 10;
	private static B obj;
	
	private B() {
		//this.var = a;
		System.out.println("obj created");
	}
	
	public static B getObj() {
		if(obj == null) {
			synchronized (B.class) {
				if(obj == null) {
					obj = new B();
				}
			}
			//return obj;
		}
		return obj;
	}
	public void fun() {
		System.out.println("hello");
		//System.out.println(obj.var);
	}
}

public class LazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B object =B.getObj();
		object.fun();
		B object1 = B.getObj();
		object1.fun();
		//System.out.println(object.var);

	}

}
