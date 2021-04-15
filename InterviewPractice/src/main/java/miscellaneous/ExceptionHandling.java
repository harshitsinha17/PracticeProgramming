package miscellaneous;

import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * in nested try catch block the 1st exception that occurs is catched and then nothing happens
 * if for one try, in one catch exception is not handled then it is checked in parent catches if it can satisfy else it will print JVM stacktrace
 * parent try checks only in parents catch blocks for handling, if its not handled in  any of those then stacktrace.
 * child try checks if it gets handled in child catch blocks otherwise also goes to parent catch blocks as well.
 */

class checkedExceptionPropagation{
	
	public void c() throws IOException {
		throw new IOException();
	}
	
	public void b() {
		try {
			c();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside checked");
		}
	}
	
	public void a() {
		b();
	}
}

public class ExceptionHandling {
	
	public void two() {
		try {
			int a = 5/0;
				
		}
		catch(NullPointerException e) {
			
		}
		
		
	}
	public void one() {
		try {
			two();
		}
		catch ( ArithmeticException e) {
			e.printStackTrace();
			System.out.println("hey");
		}
		
		
		
	}
	
	public void zero() throws FileNotFoundException{
		System.out.println("inside zero");
		throw new FileNotFoundException();
		
	}
	
	
	public void negative() {
		try {
			zero();
		}
		catch(FileNotFoundException e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b[] = new int[10];
		ExceptionHandling ob = new ExceptionHandling();
		ob.negative();
		
		System.out.println("=============Checked Exception======");
		//CheckedExceptionPropagation
		checkedExceptionPropagation object = new checkedExceptionPropagation();
		object.a();
		
		
		  try {
		 
			  System.out.println("Now checking Arithmetic");
			  int x = 2/0;
			//System.out.println(b[11]);
			try {
				System.out.println("Now checking nullpointer");
				String s = null;
				System.out.println(s.length());
			}
			catch(ArithmeticException e) {
				System.out.println("arith");
			}
		}
		catch (Exception e){
			System.out.println("indexout");
		}
		

	}

}
