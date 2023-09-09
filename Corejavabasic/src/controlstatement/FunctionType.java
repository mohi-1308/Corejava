package controlstatement;

public class FunctionType {
		void add(int a,  int b)
		{
			System.out.println( "Addition:"+(a+b));
			
		}
		static void mul(int a, int b) {
			System.out.println("multiplication:"+(a+b));
		}
		int sub (int a, int b)
		{
			return a-b;
			
		}
		float div (int a, int b) {
			return a/b;
		}
		String displayName(String name) {
			return "Hello"+name;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FunctionType f=new FunctionType();
			f.add(3, 5);
			mul(3,6);
			System.out.println("subtraction:"+f.sub(6, 3));
			System.out.println("subtraction:"+f.div(6, 3));
			System.out.println(f.displayName("mohini"));
			DisplaySquare.Square(4);
			

	}

}
