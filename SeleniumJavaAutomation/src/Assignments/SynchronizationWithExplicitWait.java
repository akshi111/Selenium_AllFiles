package Assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWithExplicitWait {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		int j=0;
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
				
		WebElement DropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown = new Select(DropDown);
		dropDown.selectByValue("consult");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		
		String[] items = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add')]")));

		List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));
		
		for(int i=0;i<products.size();i++) {
			String name = products.get(i).getText();
			
			List<String> itemsNeeded = Arrays.asList(items);
			
			if(itemsNeeded.contains(name)) {
				driver.findElements(By.xpath("//div[@class='card-footer']/parent::div[@Class='card h-100']")).get(i).click();
				
				j++;
				if(j==name.length()) {
					break;
				}
			}
		}
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
//		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
//		
		
		
	}

}
