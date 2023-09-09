package patternmatching;

public class Pyramid2 {

	public static void main(String[] args) {
			for (int i=1; i<=3; i++) {
				for (int j=1; j<=5; j++) {	
					if(i+j==4 || i+j==6 && i>1 || i+j==8)
					{
						System.out.print(i+ " ");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	}
/*
  1   
 2  2  
3  3  3 
 */

