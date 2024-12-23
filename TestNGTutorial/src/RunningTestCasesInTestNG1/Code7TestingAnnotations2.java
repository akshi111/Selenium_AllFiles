package RunningTestCasesInTestNG1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Code7TestingAnnotations2 {
	
	@Test
	public void welcome() {
		System.out.println("Welcome");
	}
	
	@Test
	public void Hi() {
		System.out.println("Hi how are you?");
	}
	
	@AfterSuite
	public void firstName() {
		System.out.println("Enter your FirstName");
	}
	
	@Test
	public void lastName() {
		System.out.println("Enter your lastName");
	}

}
