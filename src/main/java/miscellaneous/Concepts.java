package miscellaneous;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Book{
	public final String name;
	public String author;
	Book(String name, String author){
		this.name = name;
		this.author = author;
	}
}

class HarryPotter extends Book{

	HarryPotter(String name, String author) {
		super(name, author);
		// TODO Auto-generated constructor stub
	}
	public void getName(String name) {
		System.out.println(name);
	}
	
}

public class Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CopyOnWriteArrayList<Integer> list 
        = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 }); 
		
		System.out.println(list);
    Iterator itr = list.iterator(); 
    while (itr.hasNext()) { 
        Integer no = (Integer)itr.next(); 
        System.out.println(no); 
        if (no == 8) 

            // This will not print, 
            // hence it has created separate copy 
            list.add(14); 
    } 
    System.out.println(list);
} 
		
	

}
