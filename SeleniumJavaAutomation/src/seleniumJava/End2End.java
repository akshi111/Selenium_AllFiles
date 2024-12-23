package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//From - To
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Calender
		driver.findElement(By.xpath("//td[@data-handler='selectDay' and @data-month='7' and @data-year='2024']/a[@class='ui-state-default' and text()='20']")).click();
		
		//Disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
				
		//Checkbox
		//driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
											// or		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();

		//No.of passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();		

				
		//Currency - dropdown with select tag 
		WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Dropdown);
		dropdown.selectByIndex(3);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
   }

}