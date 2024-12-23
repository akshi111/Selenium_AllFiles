package RunningTestCasesInTestNG1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Code16RunnungTestsInParallelAndGeneratingReports2 {
	
	//CODE 15 = CODE 16 - Relate
	
	@AfterTest
	public void execution() {
		System.out.println("I executed");
	}
	
	@Test
	public void evaluated() {
		System.out.println("Evaluated");
		Assert.assertTrue(false);
	}
	

}
