package numberprogram;

public class PalindromeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;//it is palindrome
		int reverse=0;// 1234 it is not palindrome
		
	int temp=num;
	System.out.println(num);
		while (num!=0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
		}
		System.out.println(reverse);
		if (reverse==temp)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
