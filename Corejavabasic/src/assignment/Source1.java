package assignment;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean isValid(String userName, String password);
}



public class Source1 {
  boolean Validate (String username, String password) 
  {
	Validate v=(str1,str2)->{return(str1.equals("ABC")&&str2.equals("DEF"))?true:false;
	};
	return v.isValid(username,password);
}
  public static void main(String[] args) throws Exception{
	  Scanner sc=new Scanner(System.in);
	  String uname="Alexa";
	  String pass="code123";
  	Source s=new Source();
  	System.out.println(s.validate(uname,pass));
  	
	}

}


//getting false