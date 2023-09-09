package controlstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		int number1, number2, result;
		Scanner input = new Scanner(System.in);
		System.out.println("choose an operator:+, -, *, or /");
		operator = input.next().charAt(0);
		System.out.println("operator==>"+operator);
		
		//Ask users to enter numbers
		System.out.println("enter first number");
		number1 = input.nextInt();
		
		System.out.println("enter second number");
		number1 = input.nextInt();
		
		switch (operator) {
		
		}
	

	}

}
