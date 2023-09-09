package oops;

 class PerformAddition {
	
	static int add(int a, int b) {
		return a+b;
	}
	static float add(int a, float b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b;
	}
	

   class MethodOverloadingEx{
	public static void main(String[] args) {
		
		System.out.println(PerformAddition.add(10,20));
		System.out.println(PerformAddition.add(12,2.5f));
		System.out.println(PerformAddition.add(1.5,2.9));
		System.out.println(PerformAddition.add(10,20,30));
	
		
	}
   }

}
