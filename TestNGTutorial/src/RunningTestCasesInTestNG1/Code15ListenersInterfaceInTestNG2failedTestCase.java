package RunningTestCasesInTestNG1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Code15ListenersInterfaceInTestNG2failedTestCase {
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute");
	}
	
	@Test
	public void first() {
		System.out.println("First");
		Assert.assertTrue(false);
	}

}
