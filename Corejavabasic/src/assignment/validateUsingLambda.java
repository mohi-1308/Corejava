package assignment;
@FunctionalInterface
interface validate{
boolean isValid(String firstName, String lastName);
}

public class validateUsingLambda {
	public boolean checkValid() {
		Validate in=(String firstName, String lastName)->{
			if(firstName.equalsIgnoreCase("one")&&lastName.equalsIgnoreCase("two")) {
				return true;
			}
			return false;
		};
		boolean bb=in.isValid("One", "two");
		return bb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateUsingLambda va=new validateUsingLambda();
		System.out.println(va.checkValid());
	}

}


	