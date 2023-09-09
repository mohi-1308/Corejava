package thread;
class MultiTable{
 synchronized void displayMulti(int n) throws InterruptedException {
for(int i=1; i<=10; i++) {
	System.out.println(n+"*" +i+ "=" + n*i);
	Thread.sleep(1000);
  }
 }
 synchronized void displayPower(int n) throws InterruptedException {
	 int temp=1;
	 for(int i=1; i<=10; i++) {
	 	System.out.println(n+"^" + i+ "=" + temp*n);
	 	temp=temp*n;
	 	Thread.sleep(1000);
	   }
	 }
}
class Multi1 extends Thread{
	MultiTable m1;
	public Multi1(MultiTable m1){
		super();
		this.m1=m1;
	}
	@Override
	public void run() {
		try {
			m1.displayMulti(5);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Multi2 extends Thread{
	MultiTable m1;
	public Multi2(MultiTable m1) {
		super();
		this.m1=m1;
	}
	@Override
	public void run() {
		try {
			m1.displayPower(2);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class SynchronizeEx {

	public static void main(String[] args) {
		MultiTable m=new MultiTable();
		Multi1 mm=new Multi1(m);
		mm.start();
		
		Multi2 mm2=new Multi2(m);
		mm2.start();
	}

}
/*
5*1=5 //thread 1 execute then
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
2^1=2 // then 2nd thread2 execute this called synchronize thread
2^2=4
2^3=8
2^4=16
2^5=32
2^6=64
2^7=128
2^8=256
2^9=512
2^10=1024
 */
 
