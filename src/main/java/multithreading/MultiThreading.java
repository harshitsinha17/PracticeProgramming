package multithreading;

class Student implements Runnable{

	int amount;
	Thread parent;
	public Student(int amount) {
		super();
		this.amount = amount;
	}
	public Student(int amount, Thread t1) {
		super();
		this.amount = amount;
		this.parent = t1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			if(parent !=null)
				parent.join();
			System.out.println("Executoin"+Thread.currentThread().getName()+" "+amount);
			System.out.println("sleeping");
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Student(1000));
		Thread t2 = new Thread(new Student(1500,t1));

		t1.start();
		t2.start();
	}

}
