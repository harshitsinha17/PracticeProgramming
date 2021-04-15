package miscellaneous;

class Sin{
	int x;
	Sin(int x){
		this.x = x;
	}
}

class Har implements Cloneable{
	int y;
	Sin obj;
	
	Har(int y, Sin ob){
		this.y = y;
		this.obj = ob;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	@Override
	public String toString() {
		return "Har [y=" + y + ", obj=" + obj.toString() + "]";
	}

	
}

class AfterDeepSin implements Cloneable{
	
	int x;

	public AfterDeepSin(int x) {
		this.x = x;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class AfterDeepHar implements Cloneable{
	
	int y;
	AfterDeepSin obj;

	public AfterDeepHar(int y, AfterDeepSin obj) {
		this.y = y;
		this.obj = obj;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		AfterDeepHar object = (AfterDeepHar) super.clone();
		object.obj = (AfterDeepSin) obj.clone();
		
		return object;
	}
	
}

public class CloningDeepShallow {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Shallow Copy
		
		Sin Sinobject = new Sin(3);
		Har Harobj = new Har(1, Sinobject);
		
		Har cloneObj = (Har)Harobj.clone();
		System.out.println(Harobj == cloneObj);
		System.out.println(Harobj.equals(cloneObj));
		
		System.out.println(Harobj.obj.x);
		System.out.println(cloneObj.obj.x);
		Sinobject.x = 30;
		System.out.println("After changes in Sin object");
		System.out.println(Harobj.obj.x);
		System.out.println(cloneObj.obj.x);
		
		
		// Deep Copy
		System.out.println(" ====== ");
		AfterDeepSin deepSinObj = new AfterDeepSin(3);
		AfterDeepHar deepHarObj = new AfterDeepHar(1, deepSinObj);
		
		AfterDeepHar deepCloned = (AfterDeepHar)deepHarObj.clone();
		System.out.println(deepCloned == deepHarObj);
		System.out.println(deepCloned.equals(deepHarObj));
		
		System.out.println(deepHarObj.obj.x);
		System.out.println(deepCloned.obj.x);
		
		deepSinObj.x = 24;
		System.out.println("After changes in deepSin Object");
		System.out.println(deepHarObj.obj.x);
		System.out.println(deepCloned.obj.x);
		
		
	}

}
