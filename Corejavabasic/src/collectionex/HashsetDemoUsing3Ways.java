package collectionex;

import java.util.HashSet;

class Department {
	 int did;
	 String dname;
	 public int getDid() {
		 return did; 
	 }
	 public void SetDid(int did) {
		 this.did=did; 
	 }
	 public String getDname() {
		 return dname;
	 }
	 public void setDname(String dname) {
	 this.dname=dname;
	 
}
}
public class HashsetDemoUsing3Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Department> hs=new HashSet<>();
		Department d1=new Department();
		d1.SetDid(10);
		d1.setDname("HR");
		hs.add(d1);
		System.out.println("Departments");
		for(Department d:hs) {
			System.out.println(d.did);
			System.out.println(d.dname);
		}
		

	}

}
//Department