package controlstatement;

public class MaxnoFunctionType {
	static void maxfun(int a, int b, int c) {
		if(a>b && a>c) {
    System.out.println("a is greater");
		} 
	else if (b>a && b>c) {
		System.out.println("b is greater");
	}
	else  {
		System.out.println("c is greater");
	}
		
	}
	maxfun(3,4,5);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
