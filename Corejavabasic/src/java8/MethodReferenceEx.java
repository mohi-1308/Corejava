package java8;

@FunctionalInterface
interface Display {
	void display();
}

public class MethodReferenceEx {
	public void myMethod() {//using core java 1st way
		System.out.println("Method reference in java 8");
	}

	public static void main(String[] args) {
		MethodReferenceEx obj=new MethodReferenceEx();
		obj.myMethod();
		System.out.println("-----------");
//print output using core java Method reference in java 8
		//-----------
		
		
		//using  jdk-8 
		Display ref=obj::myMethod;//obj::myMethod;-syntax of method reference
		ref.display();
	}

}
