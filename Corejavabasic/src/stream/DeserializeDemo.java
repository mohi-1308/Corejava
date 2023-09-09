package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e,e1=null;//or Employee e;
		//Employee e1=null;//or Employee e1;
		FileInputStream fis=new FileInputStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		e=(Employee) ois.readObject();
		e1=(Employee) ois.readObject();
		
		System.out.println("Deserialization object. ");
		System.out.println("name:"+e.name);
		System.out.println("id:"+ e.id);
		System.out.println("name:"+e1.name);
		System.out.println("id:"+ e1.id);
		e.displayEmployee();
		e1.displayEmployee();
		ois.close();
		fis.close();
		
	}

}
