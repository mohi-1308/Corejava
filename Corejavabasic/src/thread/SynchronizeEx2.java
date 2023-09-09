package thread;

class Sychronized {
	synchronized void show(String p) {
		try {
			System.out.println("*******");
			System.out.println(p);
			Thread.sleep(1000);
			System.out.println("######");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread implements Runnable {
	Thread c;
	String m;
	Sychronized r;

	MyThread(Sychronized w, String k) {
		r = w;
		m = k;
		c = new Thread(this);
	}

	public void run() {
		r.show(m);
	}
}

public class SynchronizeEx2 {

	public static void main(String[] args) throws InterruptedException {
		Sychronized d = new Sychronized();
		MyThread t1 = new MyThread(d, "Hello");
		MyThread t2 = new MyThread(d, "java");
		t1.c.start();
		t2.c.start();
		// t1.c.join();//no change in the output
		// t2.c.join();//no change in the output

	}

}
