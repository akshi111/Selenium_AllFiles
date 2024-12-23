package RunningTestCasesInTestNG1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Code13DataProviderAnnotation1 {
	
	@Parameters({"URL", "API Key/Username"})
	@Test
	public void aeroplane(String url, String Key) {
		System.out.println("Aeroplane");
		System.out.println(url);
		System.out.println(Key);
	}
	
	@Test
	public void jet() {
		System.out.println("Jet");
	}

}
