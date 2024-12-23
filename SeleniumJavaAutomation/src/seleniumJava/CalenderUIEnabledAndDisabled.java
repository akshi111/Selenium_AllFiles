package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderUIEnabledAndDisabled {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='UDR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click();
		//Calender
		driver.findElement(By.xpath("//td[@data-handler='selectDay' and @data-month='7' and @data-year='2024']/a[@class='ui-state-default' and text()='20']")).click();
		////td[@data-handler='selectDay' and @data-month='7' and @data-year='2024']/a[@class='ui-state-default' and text()='7']
		////td[@data-handler="selectDay" and @data-month="7" and @data-year="2024"]/a[@class="ui-state-default" and text()='14']
		
		//Enabled and disabled
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("is enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(true);
		}
	}
}
