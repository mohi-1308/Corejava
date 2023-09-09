package singleton;

public class SingleObject {
	//create an object SingleObject
	private static SingleObject instance=new SingleObject();
	//make the constructor private so that this class cannot be
	//Instantiated
		private SingleObject() {}
		//get the only object available
		
		public static SingleObject getInstance() {
			return instance;
		}
		public void showMessage() {
			System.out.println("Hello World");
		}


}
