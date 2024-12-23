package RunningTestCasesInTestNG1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Code12ParameterizingFromTestNGxmlFile {
	
	@Parameters({"URL"})
	@Test
	public void setUp(String url) {
		System.out.println("SET-UP");
		System.out.println(url);
	}
	
	@Test
	public void click() {
		System.out.println("Click");
	}
	
	
	
	
	
}
