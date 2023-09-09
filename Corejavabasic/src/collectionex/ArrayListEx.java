
//how to add String type of array list
package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();//if we create integer array list instead that string to int 
		al.add("Mohini");
		al.add("Rohini");
		al.add("Ganesh");
		al.add("Parmeshwar");
		al.add("Param");
		al.add("Sunil");
		System.out.println("My arrayList:"+al);//My arrayList:[Mohini, Rohini, Ganesh, Parmeshwar]
		al.remove(3);
		System.out.println("My arrayList:"+al);//here parmeshwar remove
		System.out.println("first position:"+al.get(1));//Rohini
		al.set(2, "neha");
		System.out.println("My arrayList:"+al.size());//My arrayList
		System.out.println("My arrayList:"+al);
		ArrayList<String> all=new ArrayList<>();
		all.addAll(all);
		System.out.println("My arraylist1:"+all);
		ArrayList<Float> af=new ArrayList<>();
		af.add(1.2f);
		System.out.println("my arrayList:"+al);
        Collections.sort(al);
        System.out.println("Sorting data:"+al);
        for (String str : al) {
        	System.out.println(str);
        }
        System.out.println(al.contains("angel"));
	
	}


}
