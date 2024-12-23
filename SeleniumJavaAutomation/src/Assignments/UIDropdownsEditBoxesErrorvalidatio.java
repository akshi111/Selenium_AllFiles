package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIDropdownsEditBoxesErrorvalidatio {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sreya");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='exampleCheck1' and @type='checkbox']")).click();
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropDown = new Select(Dropdown);
		dropDown.getFirstSelectedOption().getText();
		dropDown.selectByIndex(1);
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("08/12/2024");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		//driver.close();
	}

}
