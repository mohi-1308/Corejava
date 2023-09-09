package homework;

import java.util.Scanner;

public class Factorial { // function with int
	static int fact=1;
	static int factNo(int no)
	{
		for(int i=no;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no to find factorial");
     int no=s.nextInt();
     System.out.println("factorial of "+no+" is "+factNo(no));
     s.close();
		
	}

}//5!=5*4*3*2*1
//enter the no to find factorial
//5
//factorial of 5 is 120
