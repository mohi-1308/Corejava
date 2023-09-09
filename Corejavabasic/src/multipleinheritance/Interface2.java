package multipleinheritance;

  interface Parent11{
	 void displayParent11();
}
  interface Parent12{
	 void displayParent12();
}
  interface Child extends Parent11, Parent12 {
	 void displayChild();
}
  class Child1 implements Child{

@Override
 public void displayParent11() {
	// TODO Auto-generated method stub
	System.out.println("Parent11");
}

@Override
public void displayParent12() {
	// TODO Auto-generated method stub
	System.out.println("Parent12");
}

@Override
 public void displayChild() {
	// TODO Auto-generated method stub
	System.out.println("Child");
}
  }
 public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		c.displayParent11();
		c.displayParent12();
		c.displayChild();

	}
 }

