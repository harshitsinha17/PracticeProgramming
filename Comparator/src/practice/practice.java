package practice;



//abstract class need not have abstract methods but of there is any function 
//as abstract then only abstract class can have it.

class A{
	int a;
	int b;
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	//public abstract void fun();
	public void fun2() {
		System.out.print("pol");
	}
	
	
	
}

class P extends A {

	int c;
	int d;
	public P(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
		// TODO Auto-generated constructor stub
	}
	
	
	  public void fun2() { System.out.println("lop"); }
	  
	  //func overloading
	  //return type does not matter, only thing is number and type of argument in overloaded func
	  public int fun2(int a) {
		  System.out.print("int");
		  return 6;
	  }
	  
	  public void fun2(short a) {
		  System.out.print("short");
	  }
	  
	  public long fun2(double a) {
		  System.out.print("long");
		  return 3;
	  }
	  
	 
}



public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P obj = new P(1,2,3,4);
		System.out.println(obj.a+" "+obj.b+" "+obj.c+" "+obj.d);
		
		A ob = new A(5,6); //object cannot be created for abstract class.
		obj.fun2(5L);

	}

}
