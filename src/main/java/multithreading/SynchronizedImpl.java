package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class XYZ {
	public  void fun(int a) {
		synchronized(this) {

			for(int i = 0;i<a;i++) {
				System.out.println(i+"  "+Thread.currentThread().getName());
			}
			fun2(100);
		}
	}
	
	public void fun2(int x) {
		synchronized (XYZ.class) {
			System.out.println("===== "+Thread.currentThread().getName()+ " ========");
			for(int i = 0;i<x;i++) {
				System.out.println( (i*1000)+"  "+Thread.currentThread().getName());
			}
		}
	}
}


class Boy implements Runnable{
	
	XYZ ab;

	Boy(XYZ x){
		ab = x;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ab.fun(100);
		
	}
	
}

public class SynchronizedImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ a = new XYZ();
		XYZ b = new XYZ();
		
		Thread t1 = new Thread(new Boy(a));
		Thread t2 = new Thread(new Boy(b));
		t1.start();
		t2.start();

		
		List<Integer> ls = Arrays.asList(new Integer[] {1,2,7,4,9});
		int sum1 = ls.stream().reduce(0, (sum,i)->sum+i);
		System.out.println(sum1);
		
		int max = ls.stream().max((i,j)->{return i<j?-1:1 ;}).get();
		System.out.println(max);
		
	}

}
