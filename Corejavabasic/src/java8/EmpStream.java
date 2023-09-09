package java8;

import java.util.ArrayList;
import java.util.List;

public class EmpStream {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<>();
		a1.add(new Emp(1, "Manya", "Manager", 23000));
		a1.add(new Emp(2, "Avinash", "TL", 24000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000));
		a1.add(new Emp(5, "Mohini", "Dev", 32000));
		a1.add(new Emp(6, "Pooja", "Trainer", 39000));
		
		List<String> li=al.stream().map(e-> e.totring()).collect(collectors.toList());
		System.out.println("Elements in emp list:"+li);

	}

}
