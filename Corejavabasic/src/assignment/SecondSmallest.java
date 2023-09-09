package assignment;

import java.util.Arrays;

public class SecondSmallest {

	  // Java simple approach to print smallest
    // and second smallest element.
  

	 // Driver Code
	public static void main(String[] args) {
        int arr[] = { 23,45,32,22,20,96 };
        int n = arr.length;

        // sorting the array using
        // in-built sort function
        Arrays.sort(arr);
  
        // printing the desired element
        System.out.println("second smallest element is "
                           + arr[1]);
    }
}
  
//second smallest element is 22

	


