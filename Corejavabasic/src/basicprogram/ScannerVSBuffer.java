//how to use Scanner class and buffer reader both e.g

package basicprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVSBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter ur name : ");

		String name=scanner.nextLine();

		System.out.println("name: "+name);

		System.out.println("Enter ur rollno: ");

		int rollno=scanner.nextInt();

		System.out.println("Rollno: "+rollno);

		System.out.println("Enter ur Percentage: ");

		float percentage=scanner.nextFloat();

		System.out.println("Percentage: "+percentage);
		
		/* output0- Enter ur name : 
mohini more
name: mohini more
Enter ur rollno: 
43
Rollno: 43
Enter ur Percentage: 
89.34
Percentage: 89.34*/

		
		// How to use buffer reader for e.g

		/*System.out.println("-----Buffered Reader------ ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter ur name : ");

		String fname;

		try {

			fname = br.readLine();

			System.out.println("Full name: "+fname);

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		

		System.out.println("Enter ur rollno: ");

		int rollno1=Integer.parseInt(br.readLine());

		System.out.println("Rollno: "+rollno1);*/
	}
}
//output
/*-----Buffered Reader------ 
Enter ur name : 
mohini more
Full name: mohini more
Enter ur rollno: 
34
Rollno: 34*/