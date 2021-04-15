package miscellaneous;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Amdocs {
	public static void fun() throws ServerException {
		String s = "ju";
		if(null!=s) {
			throw new ServerException("hey");
		}
	}
	
	public static void main(String args[]) {
		
		
		Callable<Integer> foo = ()->{
			TimeUnit.SECONDS.sleep(10);
			return 100;
		};
		
		int x = 100;
		int y = 200;
		swap(x,y);
		System.out.println(x+" "+y);
		
		List<Integer> ls = new ArrayList<>();
		ls.add(11);
		ls.add(25);
		ls.add(89);
		
		
		List<Integer> ls2 = new ArrayList<>();
		ls2.add(0);
		ls2.add(11);
		ls2.add(89);
		
		Stream<Integer> s1 = ls.stream();
		Stream<Integer> s2 = ls2.stream();
		
		System.out.println( Stream.concat(s1, s2).distinct().collect(Collectors.toList()) );
		
		
		List<String> str = new ArrayList<>();
		
		str.add("Audi");
		str.add("Innova");
		str.add("Harshit");
		
		String q = str.stream().filter(a->a.contains("a")).findFirst().orElse("New Car");
		System.out.println(q);
		
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(foo);
		Integer result = 0;
		try {
			result = future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		//fun();
		
		Map<Integer, Integer> hashmap = new HashMap<>();
		hashmap.put(1, 2);
		hashmap.put(100, -8);
		hashmap.put(6, 200);
		
		Map<Integer, Integer> map = new TreeMap<>( (e1,e2)->hashmap.get(e1).compareTo(hashmap.get(e2)) );
		
		map.putAll(hashmap);
		System.out.println(map);
		(new Integer(3).toBinaryString(i));
		
		System.out.println()
		
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
