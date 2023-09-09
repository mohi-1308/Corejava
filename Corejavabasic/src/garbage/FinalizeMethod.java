package garbage;


public class FinalizeMethod {
	String s;
	public FinalizeMethod(String s) {
		this.s=s;
		
	}

	public static void main(String[] args) {
		FinalizeMethod t1=new FinalizeMethod("t1");
		FinalizeMethod t2=new FinalizeMethod("t2");
		t1=t2;
		//t1=null;//object previously referenced byt2is Successfully garbage collected.
		//t2=null;//object previously referenced byt1is Successfully garbage collected.

		
		System.gc();
	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("object previously referenced by"+this.s+"is Successfully garbage collected.");
	
	}

}
