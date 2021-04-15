package miscell;


interface Proto{
	public Proto Clone();
}

class C implements Proto{

	int id;
	C(int id){
		this.id = id;
	}
	@Override
	public Proto Clone() {
		// TODO Auto-generated method stub
		return new C(id);
	}
	
}

public class Prototype  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new C(100);
		C clonedObj = (C)obj.Clone();
		System.out.println(clonedObj.id);
	}

}
