package thread;
class Threadone extends Thread{
	public void run() {
		System.out.println("Thread1");
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("Thread2");
		for(int i=11; i<=15; i++) {
			System.out.println(i);
		}
		
	}
}


public class ThreadUsingInheritance {

	public static void main(String[] args) {
		Threadone t=new Threadone();
		t.start();
		ThreadTwo t1=new ThreadTwo();
		t1.start();

	}

}
/*
 Thread1
0
1
2
3
4
Thread2
11
12
13
14
15
 */
