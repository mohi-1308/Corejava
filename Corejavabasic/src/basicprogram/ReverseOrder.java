//reverse of an array
package basicprogram;

		import java.io.BufferedReader;

		import java.io.IOException;

		import java.io.InputStreamReader;

		 

		public class ReverseOrder {

		 

			public static void main(String[] args) throws NumberFormatException, IOException {

				

				int ar[]=new int[10];

				int sum=0;

			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

				

			for(int i=0;i<ar.length;i++)

				{

			System.out.println("Enter the element at "+ i +" index position");

			ar[i]=Integer.parseInt(bufferedReader.readLine()); //runtime error i/o - Exception			

					

				}

				

				System.out.println("Original array:");

				for(int i=0;i<ar.length;i++)

				{

					System.out.print(ar[i]+ " ");

					

				}

				

				

				System.out.println("Reverse order array:");

				for(int i=ar.length-1;i>=0;i--)

				{

					System.out.print(ar[i]+ " ");

					

				}

		 

			}

		 

		
	}

/*Enter the element at 0 index position
10
Enter the element at 1 index position
20
Enter the element at 2 index position
65
Enter the element at 3 index position
43
Enter the element at 4 index position
78
Enter the element at 5 index position
95
Enter the element at 6 index position
12
Enter the element at 7 index position
30
Enter the element at 8 index position
45
Enter the element at 9 index position
78
Original array:
10 20 65 43 78 95 12 30 45 78 Reverse order array:
78 45 30 12 95 78 43 65 20 10 */
