package thread;
class Multiplication implements Runnable{
	@Override
	public void run() {
		int num=4;
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*" +i+ "=" +num*i);
		}
		
	}

}
class Fibonacci implements Runnable{

	@Override
	public void run() {
		int num=12;
		int f1=0, f2=1,f3;
		for(int i=1; i<=num; i++) {
			f3=f1+f2;
			System.out.println(+f3);
			f1=f2;
			f2=f2;
		}
		
	}
}
class EvenOdd implements Runnable{
	@Override
	public void run() {
		int n=4;
		if(n%2==0) {
			System.out.println("it is Even No:"+n);
		}
		else
		{
			System.out.println("it is Odd No:"+n);
		}
		//System.out.println("EvenOdd Runnable:");
	}
}

public class ThreadMultiOperationExampleUsingImplementRunnable {

	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		Thread t = new Thread(m);
		t.start();
		t.setName("Multiplication");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("thread priority:"+t.getName());
		System.out.println("thread priority:"+t.getPriority());
		Fibonacci f=new Fibonacci();
		Thread tt = new Thread();
		tt.start();
		EvenOdd e=new EvenOdd();
		Thread ttt = new Thread();
		ttt.start();
		ttt.setPriority(Thread.MIN_PRIORITY);
		System.out.println("thread priority:"+ttt.getPriority());

	}

}


