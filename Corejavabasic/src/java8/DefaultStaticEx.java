package java8;
interface MyInter1{
	void msg();
	void msg2();
	default void display() {
		System.out.println("Default method of interface");
	}
	static void displayStatic() {
		System.out.println("Display Static method of interface");
	}//we call static method using class name 
	//no need object create
}

interface MyInter2{
	void msg2();
		
}

public class DefaultStaticEx implements MyInter1 {

	public static void main(String[] args) {
		DefaultStaticEx d = new DefaultStaticEx();
		d.msg();
		d.display();
		MyInter1.displayStatic();
		d.msg2();
		
	}

	@Override
	public void msg() {
	System.out.println("My abstract method");
		
	}
	
	@Override
	public void msg2() {
	System.out.println("My abstract method2");
		
	}
}
