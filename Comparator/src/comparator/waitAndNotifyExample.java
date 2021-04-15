package comparator;

class Ax implements Runnable{
	String x;
	
	public Ax(String x) {
		this.x =x;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (x) {
			System.out.println("wait at "+System.currentTimeMillis());
			try {
				x.wait();
				System.out.println(x);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class By implements Runnable{

	String y;
	
	public By (String c){
		this.y = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		synchronized (y) {
			try {
				//Thread.sleep(4000);
				System.out.println(y);
				y.notify();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class waitAndNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t1 = new Thread(new Ax("hey"));
		Thread t2 = new Thread(new By("good"));
		
		t2.start();
		t1.start();
	}

}
