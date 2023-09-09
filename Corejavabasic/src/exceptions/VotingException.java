package exceptions;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class VotingException {
	void validAge(int age) throws InvalidAgeException {
   if (age<18) {
	   throw new InvalidAgeException("Invalid age");
   }
   else {
	   System.out.println("valid age");
   }
	}
	public static void main(String[] args) {
		VotingException v=new VotingException();
		try {
			v.validAge(22);//valid age-output
			//v.validAge(2);//if i put here less than 18 then getting Exception occur
			//and Invalid age

		}
		catch (InvalidAgeException e) {
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
		}

	}

}//v.validAge(2);
//Exception occur
//Invalid age
//v.validAge(22)-valid age