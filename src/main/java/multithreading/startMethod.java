package multithreading;

class NewStudent extends Thread{

	int amount;
	Thread parent;
	public NewStudent(int amount) {
		super();
		this.amount = amount;
	}
	public NewStudent(int amount, Thread t1) {
		super();
		this.amount = amount;
		this.parent = t1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("hello"+Thread.currentThread());	
	}
	
	/*public void start() {
		System.out.println("Inside start");
		//super.start();;
	}*/
	
}

public class startMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewStudent t1 = new NewStudent(0,null);
		NewStudent t2 = new NewStudent(0,Thread.currentThread());

		t1.start();
		t2.start();
	}

}
