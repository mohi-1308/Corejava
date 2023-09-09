package patternmatching;

public class DimondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=7;
    int k=1;
    int s=n/2;
    for (int i=1; i<=n; i++)
    {
    	for (int j=1; j<=5; j++)
    	{
    		System.out.print(" ");
    	}
    	for (int j=1; i<k; j++)
    	{
    		System.out.print( "*");
    	}
    	System.out.println();
    	if (i<=n/2)
    	{
    		s--;
    		k+=2;
    	}
    	else
    	{
    		s++;
    
    		k-=2;
    	}
    }
	}

}
