package RunningTestCasesInTestNG1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Code15ListenersInterfaceInTestNG1 implements ITestListener{
	
	//CODE 15
	//CODE 16
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
//		System.out.println("I sucessfully executed Listeners Pass Code");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		//Screen shot code
		//response if API is failed
		System.out.println("I failed executed Listeners Pass Code" +result.getName());

	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	
	
	

}
