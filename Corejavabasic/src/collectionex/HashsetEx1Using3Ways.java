package collectionex;

import java.util.HashSet;

class Department{
	 int did;
	 String dname;
	 public Department(int did, String dname) {
		 this.did=did;
		 this.dname=dname;
	 }
 }

public class HashsetEx1Using3Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Department> hs=new HashSet<>();
		hs.add(new Department(1, "Sales"));
		hs.add(new Department(2, "IT"));
		System.out.println("Department");
		for(Department d:hs) {
			System.out.println(d.did);
			System.out.println(d.dname);
		}
		
		
	}

}
