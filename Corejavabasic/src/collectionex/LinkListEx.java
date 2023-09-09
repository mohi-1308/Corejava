package collectionex;

import java.util.LinkedList;
import java.util.Stack;

public class LinkListEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.addFirst(23);
		ll.add(6);
		ll.addLast(40);
		System.out.println("Element in Lined list:"+ll);
		ll.removeLast();
		System.out.println("Element in Lined list:"+ll);
		Stack<Integer> s=new Stack<>();
		s.push(10);//here add method nahi hai instead that we take push method.
		s.push(12);
		s.push(14);
		System.out.println("Element in Lined list:"+s);
		s.pop();//remove top volue 14
		System.out.println("Element in Lined list:"+s);
		
		
	}

}
