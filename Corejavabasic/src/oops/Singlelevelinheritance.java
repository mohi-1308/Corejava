package oops;
class Vehicle{
	String Vname;
	void displayV()
	{
		System.out.println("parent class:"+Vname);
	}
}
class Bike extends Vehicle{
	int speed;
	void dipSpeed() {
	System.out.println("Bike speed:"+speed);
	}
}
public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.speed=100;
		b.dipSpeed();
		b.Vname="honda";
		b.displayV();

	}

}
