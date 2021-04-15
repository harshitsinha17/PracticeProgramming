package miscellaneous;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableImpl implements Callable<Integer>{

	String str;
	
	public CallableImpl(String s) {
		// TODO Auto-generated constructor stub
		str = s;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside call method "+Thread.currentThread().getName()+" Iterator "+str );
		Thread.sleep(10000);
		return 2;
	}
	
}

public class CallableAndFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		/*
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<Integer> c = new CallableImpl();
		Future<Integer> f = executor.submit(c);
		System.out.println(f.get());
		
		executor.shutdown();
		*/
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i = 0;i<10;i++) {
			Callable <Integer> c = new CallableImpl(" "+i);
			Future<Integer> f = executor.submit(c);
		}
		
		executor.shutdown();

	}

}
