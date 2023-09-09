
/*class MyException: Define exception
 class Source:
 method definitons:
 checkName(String firstName,String lastName)throw a user defined
exception if firstName and lastName is blank else return name
 return type: String
 visibility: public
 * checkName(String firstName,String lastName): throw a user defined exception if
firstName and lastName is blank else return name*/

package exceptions;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
public class CheckNameExceptionEx {
	public String CheckName (String firstName, String lastName)throws MyException {
	if (firstName.isEmpty()) {
		throw new MyException("firstname is empty");
	}
	else if (lastName.isEmpty()) {
		throw new MyException("lastname is empty");
	}else {
		return firstName + lastName;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNameExceptionEx x=new CheckNameExceptionEx () ;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter first name");//mohini
			String fname = sc.nextLine();
			System.out.println("enter last name");//more
			String lname = sc.nextLine();
			
			String s;
			try {
				s = x.CheckName(lname, fname);
				System.out.println(s);
			}catch (MyException e) {
				System.out.println(e);
			}
	}

	}
/*enter first name
mohini
enter last name
more
moremohini
*/
