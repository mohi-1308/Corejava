package constructor;

public class ConstructorTypes {
	int id;
	String name;
    String degree;
    //default constructor
    public ConstructorTypes() {
    	id=1;
    	name="mohini";
    	degree="Be";
    	System.out.println("Default");
    
    }
    //Parameterized constructor
    ConstructorTypes( int id, String name, String degree){
    	this.id=id;
    	this.name=name;
    	this.degree=degree;
    }
    ConstructorTypes(String name){
    	this.degree=degree;
    }
    //copy constructor
    ConstructorTypes(ConstructorTypes d){
    	id=d.id;
    	name=d.name;
    }
    void display() {
    	System.out.println("id:"+id+"+name:"+name);
    }
    void ConstructorTypes() {
    	System.out.println("riya");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTypes d=new ConstructorTypes();
		d.id=1;
		d.name="sima";
		d.ConstructorTypes();
		d.display();
        System.out.println("----------------");
        ConstructorTypes d1=new ConstructorTypes(12, "purva", "bsc");
        d1.display();
        System.out.println("-----------");
        
        ConstructorTypes d3=new ConstructorTypes( "purva" );
        d3.display();
        System.out.println("-----------");
        
		
        ConstructorTypes d4=new ConstructorTypes(  );
        d4.display();
        System.out.println("-----------");
        
	}

}
