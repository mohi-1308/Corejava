package typecasting;

public class WidningVSNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10; // can convert 1byte to 4byte

		int i=b;

		//smaller-->bigger---->Implicit-->Widening
		{
		System.out.println(i);//10
		}
		//bigger-->smaller-->Explicit--->Narrowing

		int ii=30;

		byte b1=(byte) ii; // can't convert 1byte to 4byte thats why here take (byte)explicit manually
		float f=ii;
		{
			System.out.println(ii);//30
			}
			
	}

}

/*
10
30

 */





	


