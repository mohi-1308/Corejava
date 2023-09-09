package exceptions;
//unchecked/ runtime exception
public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int c=10/5;
    	 //int c=10/0;//number can not divide by zero
    	 System.out.println( "value of c: "+c);
     }
     catch(ArithmeticException e) {
    	 System.out.println("number can not divide by zero");
     }
     
     }
	}


