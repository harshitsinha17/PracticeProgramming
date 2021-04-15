package multithreading;

class Employee{
	int amount=10000;
	/*
	synchronized public void deposit(int amount) throws InterruptedException {
		System.out.println("Trying depositying");
		this.amount = this.amount+amount;
		Thread.sleep(10000);
		System.out.println("money deposited");
		notifyAll();
	}
	
	synchronized public void withdraw(int money) throws InterruptedException {
		if(amount<money) {
			System.out.println("Waiting since money to b e withdrawnm is greater");
			wait();
		}
		System.out.println("money withdrawn");
	}
	
	*/
	
	
	
	public void deposit(int amount) throws InterruptedException {
		System.out.println("Trying depositying");
		synchronized (this) {
			this.amount = this.amount+amount;
			Thread.sleep(10000);
			System.out.println("money deposited");
			notifyAll();	
		}
		
	}
	
	public void withdraw(int money) throws InterruptedException {
		synchronized(this) {
			if(amount<money) {
				System.out.println("Waiting since money to b e withdrawnm is greater");
				wait();
			}
				
		}
		System.out.println("money withdrawn");
	}
	
}

public class WaitNotifyImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		Thread t1 = new Thread(()->{
			try {
				emp.withdraw(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		
		Thread t2 = new Thread(  ()->{
			try {
				emp.deposit(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}   );
		t2.start();
	}

}
