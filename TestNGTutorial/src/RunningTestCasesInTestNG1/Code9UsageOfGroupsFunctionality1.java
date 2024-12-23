package RunningTestCasesInTestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Code9UsageOfGroupsFunctionality1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORE CLASS");
	}
	
	@Test(groups= {"Smoke"})
	public void transport() {
		System.out.println("Transport");
	}
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("BEFORE METHOD1");
	}
	
	@AfterMethod
	public void afterMethod1() {
		System.out.println("AFTER METHOD1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASS");
	}
	
	@Test
	public void bike() {
		System.out.println("Bike");
	}
	
	@BeforeSuite
	public void auto() {
		System.out.println("Auto");
	}
	
	@Test
	public void end() {
		System.out.println("End");
	}

}
