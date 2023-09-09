//multiple inheritance
package oops;
class university{
	String name;
	String place;
	 void displayUniversity() {
		 System.out.println("university name:"+name);
	 }
}

class Colleage extends university{
	String colname;
	int id;
	String location;
	void displaycolleage() {
	System.out.println("Colleage name:"+name);
}
}
	class Branch extends Colleage {
		String branchname;
		int lecture;
		String hod;
		void displaybranch() {
		System.out.println("Branch name:"+name);
	}
	}

public class MultilevelInheritance {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Branch b1=new Branch();
		b1.displayUniversity();
		b1. displaycolleage();
		b1.displaybranch();
		b1.branchname="Electronics";
	}

	

}
