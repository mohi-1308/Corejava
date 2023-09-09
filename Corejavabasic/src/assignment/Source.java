package assignment;
//LambdaUsingNamePass
@FunctionalInterface
interface validate{
	boolean isvalid(String firstName, String lastName);
}

public class Source {
	
    boolean validate (String username, String password) {
	validate v=(str1,str2)->{
		return(str1.equals("ABC")&&str2.equals("DEF"))?true:false;
	};
	return v.isvalid(username,password);
}
    public static void main(String[] args) {
    	Source s=new Source();
    	System.out.println(s.validate("ABC", "DEF"));
    	
	}

}
//true output
//true