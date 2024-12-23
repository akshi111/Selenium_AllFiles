package seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	
	public static void main(String[] args) //throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		//Thread.sleep(2000);
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
		
	}

}
