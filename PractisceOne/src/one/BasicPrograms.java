package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPrograms 
{
	public static void main(String[] main) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String displayMessage = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(displayMessage);
		
		
	

}
}

