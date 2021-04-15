package comparator;

class A implements Runnable{

	static Thread Parent;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


class B implements Runnable{
	
	static Thread Parent;

	@Override
	public void run() {
		
		try {
			Parent.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		System.out.println("good");
		
	}
	
}


class C implements Runnable{

	static Thread Parent;
	
	@Override
	public void run() {
		try {
			Parent.join(); //C waiting for parent thread to finish executing
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("morning");
		
	}
	
}




public class threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		Thread t3 = new Thread(new C());
		
		B.Parent = t1;
		C.Parent = t2;
		
		
		
		t1.start();
		t2.start();
		t3.start();

		System.out.println("hey");

	}

}
