package stream;

import java.io.Serializable;

public class Employee implements Serializable{
	public int id;
	public String name;

	public  void displayEmployee() {
		System.out.println("Name:"+name+"Address:"+id);

	}

}
