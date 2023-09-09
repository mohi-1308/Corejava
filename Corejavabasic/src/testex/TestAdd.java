package testex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAdd {
	public  int add(int a, int b) {
		return a+b;
		
	}
	@Test
	public void addTest() {
		TestAdd a=new TestAdd();
		//assertEquals(2, a.add(1, 1));
		//assertEquals("error in add()", 4, TestAdd.add(2,2));
		assertEquals("Error in add code", 4,a.add(2, 2));
	}
	

}
//we can create junit project insidt the javaproject,test case pass in java project