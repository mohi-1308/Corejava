package oops;
 class Rectangle{
	 private double length;
	 private double width;
	 public Rectangle() {
		 length=0;
		 width=0;
	 }
	 public Rectangle( double length, double width) {
		 this.length=length;
		 this.width=width;
	 }
	 public double GetArea() {
		 return length*width;
	 }
 }
	class Box extends Rectangle {
		private double height;
		
		public Box() {
			super();//default constructor of parent class
			height=0;
		}
		public Box (double length, double width, double height) {
		super(length,width)	;
		this.height = height;
		}
		public double getVolume() {
			return GetArea() * height;
		}
	}
		

public class SuperConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox1=new Box();
		System.out.println( "volume:"+ myBox1.getVolume());
		
		Box myBox2=new Box( 12.2,4.5,3.5);
		System.out.println( "volume:"+ myBox2.getVolume());
		
	}

}
//volume:0.0
//volume:192.15
