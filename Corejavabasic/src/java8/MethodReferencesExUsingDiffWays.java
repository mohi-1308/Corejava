package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferencesExUsingDiffWays {

	public static void main(String[] args) {
		// different ways to print list
		List<Integer> num = Arrays.asList(122, 56, 43, 22, 13, 5, 59, 56);

		System.out.println("My List :" + num);
		// output-My List :[122, 56, 43, 22, 13, 5, 59, 56]

		// using collection
		Collections.sort(num, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {

				return i1.compareTo(i2);
			}

		});
		System.out.println("For loop:");
		for (Integer i : num) {
			System.out.println(i + " ");
		}

		/*
		 * output-5 13 22 43 56 56 59 122
		 */

		// anonymous function using
		System.out.println("Anonymous fun.....");
		num.forEach(System.out::print);
		System.out.println();
		// Anonymous fun.....
		// 5132243565659122

		// Lambda Function.....
		System.out.println("lambda function..");
		Collections.sort(num, (i1, i2) -> i1.compareTo(i2));
		num.forEach(System.out::println);
		System.out.println();
		/*
		 * lambda function.
		 * 
		 * 5 13 22 43 56 56 59 122
		 */
		// method references
		
	}

}
