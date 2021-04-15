package miscellaneous;


class TryCatch{
	public static void a() {
		System.out.println("After func invoke "+b());
	}
	public static int b() {
		try {
			return 1;
		}
		catch(Exception w) {
			return 2;
		}
		finally {
			System.out.println("Inside finally");
			return 3;
		}
	}
}


public class TryCatchFinally {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatch.a();

	}

}
