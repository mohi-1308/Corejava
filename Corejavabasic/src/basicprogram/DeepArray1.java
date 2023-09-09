package basicprogram;

public class DeepArray1 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,6,5,9};

		

		int clonea[]=a.clone();

 

		System.out.println(a==clonea);//false

		

		for(int i=0;i<clonea.length;i++);

		{

		System.out.println(clonea[i]+" ");//1
		                                  //6
                                          //9
		                                  //5
	}

}
}