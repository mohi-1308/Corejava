package doselect;//doselect

import java.util.Scanner;

public class StringMultiplication {
	
public static String multiplyStrings(String num1,String num2) {
	//convert the String to BigInteger for accurate multiplication
	StringMultiplication bignum1=new StringMultiplication(num1);
	StringMultiplication bignum2=new StringMultiplication(num2);
	
	//Multiply the BigIntegers
	StringMultiplication result = bigNum1.multiply(bigNum2);
	
	//convert the result back to a string
	return result.toString();
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//input format
		//the first line is the string
		//the second line is the second string
		String num1 = Scanner.nextLine().trim();
		String num2 = Scanner.nextLine().trim();
		
		//call the multiplyString Function
		String result=multiplyStrings(num1,num2);
		
		//output the result
		System.out.println(result);
		
		
	

	}

}
