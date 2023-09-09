package abtract;
abstract class AbstractEx1{
	abstract void display();
	void msg() {
		System.out.println("Hello");
	}
	static void msg1() {
		System.out.println("Hello");
	}
	//final void msg2() {
	//	System.out.println("Hello");
	//}
}
   class Abstractchild extends AbstractEx1{
	@Override//annotation
	void display() {
		System.out.println("Abstract Child");
	}
	  
  }
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Abstractchild ac1=new Abstractchild();
		 ac1.display();
		 ac1.msg();
		 AbstractEx1 aeref;
		 aeref=ac1;
		 aeref.display();
		 Abstractchild ac=new Abstractchild();
		 ac.display();
		 AbstractEx1.msg1();
		// AbstractEx1.msg2();
	}

}
//in abstract class we can define method but can't call


	

