package basicprogram;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=50;
int b=20;
int sum;
a++;//increment operator
++b;
System.out.println("Post increment:"+a);
System.out.println("pre increment:"+b);

a--;
--b;
System.out.println("Post decrement:"+a);
System.out.println("Pre decrement:"+b);
int z=2055;
int z1=~z;
System.out.println("Invertion:"+z1);

System.out.println("-----Arithmatic operator----");//types of Arithmetic operations.
sum=a+b;
System.out.println("Addition:"+sum);
sum=a-b;
System.out.println("subtraction:"+sum);
sum=a*b;
System.out.println("multiplication:"+sum);
sum=a/b;
System.out.println("division:"+sum);
sum=a%b;
System.out.println("modulus:"+sum);

a+=b;//Assignment operator
System.out.println("assignment:"+a);
int x=5;
int y=3;
int w=33;
x%=y+w;/*x%=y+w, 
3+33=36, x=x%36
*/
System.out.println("Assignment:"+x);
y+=3;//y=y+3=6
System.out.println("Addition:"+y);

//conditional operator
int a1=10;
int b1=20;
int c1 = a1>b1 ? a1 : b1;
System.out.println("conditional:"+c1);







	}

}
