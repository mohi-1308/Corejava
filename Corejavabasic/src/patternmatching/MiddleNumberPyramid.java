package patternmatching;

public class MiddleNumberPyramid {

	public static void main(String[] args) {
				int numRows1 = 3;
				int numRows2 = 2;
				int numRows3 = 4;

				System.out.println("Middle Pyramid 1:");
				printMiddleNumberPyramid(numRows1);

				System.out.println("\nMiddle Pyramid 2:");
				printMiddleNumberPyramid(numRows2);

				System.out.println("\nMiddle Pyramid 3:");
				printMiddleNumberPyramid(numRows3);
			}

			public static void printMiddleNumberPyramid(int numRows) {
				for (int i = 1; i <= numRows; i++) {
					for (int j = 1; j <= numRows - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i; k++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
			}

}

/*
 Middle Pyramid 1:
  1 
 2 2 
3 3 3 

Middle Pyramid 2:
 1 
2 2 

Middle Pyramid 3:
   1 
  2 2 
 3 3 3 
4 4 4 4 
*/

