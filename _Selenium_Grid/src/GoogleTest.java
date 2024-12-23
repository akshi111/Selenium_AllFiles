import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.WIN8);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.51.48:4444").toURL(),caps);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
		
	}

}
