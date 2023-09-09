package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		e.id=1308;
		e.name="Mohini";
		Employee e1=new Employee();
		e1.id=2606;
		e1.name="parmeshwar";
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		System.out.println("Data Saved.");

	}

}
