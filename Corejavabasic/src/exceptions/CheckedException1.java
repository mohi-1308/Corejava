package exceptions;
//checked exception/compile time exception
public class CheckedException1 {

	public static void main(String[] args) {
		try {
			Class.forName("basicprogram.SumOfArray2");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//System.out.println("class not found: +e");
			e.printStackTrace();
		}
		finally {
		System.out.println("finally block");

	}

}
}