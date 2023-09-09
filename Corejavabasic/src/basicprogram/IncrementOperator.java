package basicprogram;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=10;
   int b=7;
   a++;
   ++b;
   System.out.println("post increment:"+a);
   System.out.println("pre increment:"+b);
   a--;
   --b;
   System.out.println("post decrement:"+a);
   System.out.println("pre decrement:"+b);
		int z=2044;
		int z1=~z;
		System.out.println("Invertion:"+z1);
		
		int c=a+b;
		System.out.println("Addition:"+c);
		
		int a1=9;
		System.out.println("-------shift operator-----");
		System.out.println("Right shift:"+(a1>>3));
		System.out.println("left shift:"+(a1<<3));
		System.out.println("-------Relational operator-----");
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		
		System.out.println("-------conditional operator-----");
		byte d=120;
		byte e=127;
		byte ans = d<e ? d : e;
		System.out.println("ans:"+(d<e));
		System.out.println("ans:"+(d>e));
		
		
		
		
		
		
		
		
		
		
		
		
   
	}

}
