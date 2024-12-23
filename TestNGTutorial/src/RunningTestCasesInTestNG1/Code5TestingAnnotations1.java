package RunningTestCasesInTestNG1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Code5TestingAnnotations1 {
	
	@Test
	public void animal() {
		System.out.println("It is an animal");
	}
	
	@BeforeTest
	public void logout() {
		System.out.println("LogOut");
	}
	
	@AfterTest
	public void login() {
		System.out.println("Login To");
	}
	
}
