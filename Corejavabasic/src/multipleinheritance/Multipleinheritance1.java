package multipleinheritance;

interface One{
	void displaynumber1();
}
interface Two{
	void displaynumber2();
}
interface Three extends One, Two{
	void displaynumber3();
}
class Four implements Three{

	@Override
	public void displaynumber1() {
		// TODO Auto-generated method stub
		System.out.println("One");
	}

	@Override
	public void displaynumber2() {
		// TODO Auto-generated method stub
		System.out.println("Two");
	}

	@Override
	public void displaynumber3() {
		// TODO Auto-generated method stub
		System.out.println("Three");
	}
	
}

public class Multipleinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Four f=new Four();
   
	}

}
