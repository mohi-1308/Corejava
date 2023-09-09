package exceptions;

public class CheckedException {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("basicprogram.IncrementOperator");
		System.out.println("Class Found");
		

	}

}
