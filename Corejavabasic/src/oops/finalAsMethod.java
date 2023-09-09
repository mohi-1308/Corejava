package oops;

public class finalAsMethod {
	final void display() {
	}
	}

	public class FinalEX extends finalAsMethod {//if we declare any class final we can not extends class
 
		final int a=10;//we can not change value
		void display() {
			
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FinalEX f=new FinalEX();
			
			
		}
}
