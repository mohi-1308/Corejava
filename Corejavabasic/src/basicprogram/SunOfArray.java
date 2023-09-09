package basicprogram;

public class SunOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {11,2,45,6,34,89,25};
		int sum=0;
		
		for(int i=0; i<ar.length;i++)
		{
		if (i%2!=0)
		{
			sum=sum+ar[i];
		}
		}
		System.out.println(sum);
		
		

	}

}
