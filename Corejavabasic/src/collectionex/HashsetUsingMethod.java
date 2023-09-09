package collectionex;

import java.util.HashSet;

public class HashsetUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> even=new HashSet<>();
		even.add(2);
		even.add(4);
		System.out.println("Hashset1:"+even);//Hashset1:[2, 4]
		
		
		HashSet<Integer> numbers=new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("Hashset2:"+numbers);//Hashset2:[1, 3]
		
		//union of two set
		numbers.addAll(even);
		System.out.println("Union is:"+ numbers);//Union is:[1, 2, 3, 4]
		
		numbers.retainAll(even);
		System.out.println("Intersection is:"+ numbers);//Intersection is:[2, 4]
		
		numbers.removeAll(even);
		System.out.println("Difference:"+ numbers);//Difference:[]
		
		}

	}


