package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
								// or		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		//Number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//in the above the size it shows the number of checkboxes.

		
	}
	

}
