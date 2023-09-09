package thread;
class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1");
		for(int i=0; i<5; i++) {
			System.out.println(i);
		
		}	
	}
	
}

public class ThreadUsingInterface {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		Thread1 t2=new Thread1();
		Thread t3=new Thread(t2);
		t3.start();
		
		

	}

}
/*Thread1
0
1
2
3
4
Thread1
0
1
2
3
4
*/