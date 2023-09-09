package controlstatement;

import java.util.Scanner;

public class SwitchStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner q=new Scanner(System.in);
		 System.out.println("Enter a charactor");
		 char ip=q.next().charAt(0);
		 
		 switch (ip)
		 {
		 case 'a':
		 case'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 case 'A':
		 case 'E':
		 case 'I':
		 case 'O':
		 case 'U':
		 {
			 System.out.println("it is a vowel");
			 break;
		 }
		 default:
		 {
			 System.out.println("it is a consonant"); 
		 }
			 
		 }
		
	}

}
