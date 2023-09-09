package singleton;

public class SingletonPatternDemo {
	//illegal construct
	//compile time Error: the constructor Singleobject()is not visible
	//SingleObject object = new SingleObject();
	//get the only object available

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject object= SingleObject.getInstance();
		object.showMessage();
		//show the message

	}

}
