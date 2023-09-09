package array;

import java.util.Arrays;

public class SecondSmElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {23, 45, 32, 22, 20, 96};
 int n=arr.length;
 Arrays.sort(arr);
 System.out.println("smallest element is"+arr[0]);
 System.out.println("second smallest element is"+arr[1]);
 
	}

}
