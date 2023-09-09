package collectionex;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();

		al.add("Rutika");

		al.add("Pragati");

		al.add("Lekha");

		al.add("Zeba");

		al.add("Angel");

		al.add(1, "Shweta");

		

		al.add("Raj");

		

		System.out.println("My arraylist:"+al);

		al.remove(3);

		System.out.println("My arraylist:"+al);

		System.out.println("First Position : "+al.get(1));

		al.set(2, "Neha");

		System.out.println("My arraylist:"+al.size());

		System.out.println("My arraylist:"+al);

		ArrayList<String> al1=new ArrayList<>();

		al1.addAll(al);

		System.out.println("My arraylist1:"+al1);

		ArrayList<Float> af=new ArrayList<>();

		af.add(1.2f);

		System.out.println("My arraylist1:"+af);

		Collections.sort(al);

		System.out.println("Sorting Data:");

		System.out.println("My Data:"+al);

	      for (String str : al) {

	         System.out.println(str);

	      }
			
			
			
			
	}


