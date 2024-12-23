package RunningTestCasesInTestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Code11AnnotationsHelperAttributesWithExample {
	

	@Test(timeOut=400)
	public void address() {
		System.out.println("Enter Full Address");
	}
	
	@Test
	public void run() {
		System.out.println("RUN");
		}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER METHOD");
	}
	
	@Test
	public void check() {
		System.out.println("Check");
	}
	
	@Test(dependsOnMethods= {"run","check"})
	public void payment() {
		System.out.println("Complete your payment");
	}
	
	@BeforeSuite
	public void phoneNumber() {
		System.out.println("PhoneNumber");
	}
	
	@Test(enabled=false)
	public void OK() {
		System.out.println("Click on OK button");
	}

}
