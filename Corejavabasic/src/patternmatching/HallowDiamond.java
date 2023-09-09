package patternmatching;
		import java.util.Scanner;

		public class HallowDiamond {
		 public void classic(int r) {
			 for(int i=0;i<r;i++) {
					for(int j=r;j>i;j--) {
						System.out.print(" ");
					}
					for(int k=0;k<=i;k++) {
						if(k==0 || k==i || k==10) {
						System.out.print("* ");}
						else 
							System.out.print("  ");
					}System.out.println();
				}
				for(int i=r;i>=0;i--) {
					for(int j=r;j>i;j--) {
						System.out.print(" ");
					}
					for(int k=0;k<=i;k++) {
						if(k==0 || k==i || k==r) {
						System.out.print("* ");}
						else 
							System.out.print("  ");
					}System.out.println();
				}
		 }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Give me a number");
				int r=sc.nextInt();
			 HallowDiamond  hd= new  HallowDiamond ();
				hd.classic(r);
			}

		
	}


