package assignment;
class DiffMethod{
	synchronized void PrintFibo() throws InterruptedException {
		int num=12;
		int f1=0, f2=1,f3;
		for(int i=1;i<=num;i++) {
			f3=f1+f2;
			System.out.println(+f3);
			f1=f2;
			f2=f2;
			Thread.sleep(1000);
					
		}
	}
	synchronized void PrintEvenOdd() {
		int n=4;
		if(n%2==0) {
			System.out.println("Even number:"+n);
		}
		else {
			System.out.println("Odd number:"+n);
		}
		
	}
	synchronized void PrimeNo() {
		int no=29;
		for(int i=2;i<no;i++) {
			if(no%i==0);
			{
				System.out.println("it is prime number");
				
			}
			if(i==no) {
				System.out.println("it is prime not number");
			}
		}
	}
}
class Multi1 extends Thread{
	DiffMethod
}
public class ThreadSynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
