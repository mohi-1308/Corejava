package oops;

public class Compiletimepolymorphism {
	
	void add(int a) {
		System.out.println("sum of"+(a++));
	}
	void add (int a, int b) {
		System.out.println("sum of "+a+"+"+ b+ ":"+(a+b));
		
	}
	void add(int a, float b) {
		System.out.println("sum of "+a+"+"+ b+ ":"+(a+b));
	}
	void add(float a, float b) {
		System.out.println("sum of "+a+"+"+ b+ ":"+(a+b));
	}
	int add(int a, int b, intc) {
		return a+b+c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Compiletimepolymorphism c=new Compiletimepolymorphism() {
	 		c.add(10);
	 		c.add(6,8);
	 		c.add(19, 6.4f);
	 		c.add(4.5f, 6.7f);		
	 		System.out.println("Addition of 3 numbers"+c.add(5,6,8));
	 		
	 	}}
	}

}}}
