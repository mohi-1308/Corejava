package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

import Defeat.DateTimeException;

public class ArithmeticEXceptionEx1 {

	//Unchecked /Runtime Exception

		public static void main(String[] args) {
			try {
			int c=10/4;
			System.out.println("Value of c: "+c);
			int a[]= {1,2,3,4,5};
			a[2]=45;
			System.out.println(a[2]);
			int a1=Integer.parseInt("1234");
			System.out.println(a1);
			String data="abc";
			System.out.println("Length:" +data.length());
			String data1= new String[5];//throws runtime exception
			data1[1] ="More data";
			integer[] intArray = {5,7,6,11,12,14,15};
			
			}
			catch(ArithmeticException e){
				System.out.println("number canot divide by zero" +e);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			catch(NumberFormatException e2) {
				System.out.println(e2);
			}
			
			finally {
				System.out.println("End of code");
				}
			}

		}


