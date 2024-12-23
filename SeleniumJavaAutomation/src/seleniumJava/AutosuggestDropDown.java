package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("aus");
	Thread.sleep(3000);
	List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	//List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	//for(int i=0;i<options.size();i++)
	for(WebElement option : options) {
		//WebElement option = option.get(i); 
		if(option.getText().equalsIgnoreCase("Austria")) {
			option.click();
			break;
		}
          }
   }
}
