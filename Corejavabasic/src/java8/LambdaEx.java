package java8;

@FunctionalInterface
	interface Myinterface{
		//int add(int a, int b)
		int mul(int a, int b);//only one method will be created inside functional interface
	}
	
interface EvenOdd{
	 int evenodd (int a);
}

interface RevrseString{
	 String  rev(String s);
}


	public class LambdaEx {
		
	public static void main(String[] args) {
		//Lambda Expression with Two parameter
		Myinterface mf = (int a,int b)->a*b;// two parameter
		System.out.println("Multiplicqation  is :...."+mf.mul(4, 7));
		
		Myinterface mf1 = (int a,int b)->a+b;
		System.out.println("sum:...."+mf1.mul(4, 7));
		
		//Lambda expression with one parameter
		EvenOdd eo=(int a)->//1 parameter
		{
			if(a%2==0)
				System.out.println("even no.");
			else
				System.out.println("odd no.");
			return a;
		};
		System.out.println(eo.evenodd(8));
		
		//reverse String
		RevrseString rs=(String s)->
		{
			String revs="";
			for(int i=s.length()-1; i>=0; i--) {
				char w=s.charAt(i);
				revs=revs+w;
			}
			return revs;
				
			};
			System.out.println("Reverse:"+rs.rev("Welcome"));
		}
	}


	// in lambda interface we take only one method
	//Multiplication  is :....28
/*Multiplication  is :....28
sum:....11
even no.
8
Reverse:emocleW
*/
