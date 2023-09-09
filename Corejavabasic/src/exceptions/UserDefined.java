package exceptions;

public class UserDefined {
	static void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException ("invalid age");
			}
		else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//validAge(10);//we put 10 getting runtime/unchecked exception
		validAge(22);
	}

}
