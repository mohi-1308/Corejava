package java8;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int a=12;//Decimal no
		String b= Integer.toBinaryString(a);//convert decimal to Binary
		System.out.println(b);//1100
		
		String f =Integer.toHexString(a);//convert Decimal to Hexadecimal
		System.out.println(f);//c
		
		String c =Integer.toOctalString(a);//convert decimal to octal
		System.out.println(c);//14


	}

}
