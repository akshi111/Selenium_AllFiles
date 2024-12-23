package RunningTestCasesInTestNG1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Code6TestingAnnotations2 {
	
	@Test
	public void click() {
		System.out.println("Click on the button");
	}
	
	@Test
	public void subscribe() {
		System.out.println("Subcription");
	}
	
	@BeforeSuite
	public void enterOtp() {
		System.out.println("Enter the OTP");
	}
	
	@Test
	public void submit() {
		System.out.println("Submit the form");
	}

}
