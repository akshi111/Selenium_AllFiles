package RunningTestCasesInTestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Code14DataProviderAnnotation2 {
	//testng92Code14.xml
	
	@Test(dataProvider = "getData")
	public void check(String username, String password) {
		System.out.println("CheckOut");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeMethod
	public void beforeFirstMethod() {
		System.out.println("BEFORE FIRST METHOD");
	}
	
	@AfterMethod
	public void afterFirstMethod() {
		System.out.println("AFTER FIRST METHOD");
	}
			
	@DataProvider
	public Object[][] getData() {
		//Test with multiple data
		Object[][] data = new Object[3][2];//Multy dimensional array
		//3 is number of combinations
		//2 is number of values
		//FIRST SET
		data[0][0]="firstsetUserName";
		data[0][1]="password";
		//columns in the row are nothing but values for that particular combination(row)
		//SECOND SET
		data[1][0]="secondsetUserName";
		data[1][1]="secondPassword";
		//THIRD SET
		data[2][0]="thirdsetUserName";
		data[2][1]="thirdPassword";
		
		return data;
	}

}
