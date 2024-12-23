package one;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	
	public static void main(String[] main) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Akshitha/OneDrive - QualiZeal/Folders/SeleniumTest/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akshitha603@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Akshi@1001");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		//Click on contacts button in - COGMENTO
		Actions actions = new Actions(driver);
		WebElement contactsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Contacts']")));
        actions.moveToElement(contactsLink).click().perform();
        driver.findElement(By.cssSelector("div[class='ui right secondary pointing menu toolbar-container'] a")).click();
		driver.findElement(By.name("first_name")).sendKeys("Akshitha");
		driver.findElement(By.name("last_name")).sendKeys("anuja");
		
		WebElement company = driver.findElement(By.name("company"));
		actions.moveToElement(company).click().sendKeys("Qualizeal",Keys.ENTER).perform();
		
		driver.findElement(By.cssSelector("i[class='unlock icon']")).click();
		driver.findElement(By.cssSelector("div[class='twelve wide field']")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[text()='Akshitha G']")).click();
		
		WebElement Tags = driver.findElement(By.xpath("//div[@class='field']//label[text()='Tags']/following-sibling::div[contains(@class, 'ui') and contains(@class, 'dropdown')]//input[@class='search']"));
		//Multiple ways of writing xpaths for Tags search button.
		//label[text()='Tags']/ancestor::div[@class='field']//input[@class='search']
		//label[text()='Tags']/following::input[@class='search']
		//div[@class='ui field']//label[text()='Tags']/following-sibling::div//input[@class='search']
		//div[@class='field']//div[contains(@class, 'ui') and .//label[contains(text(), 'Tags')]]//input[@class='search']
		//label[text()='Tags']/following-sibling::div/input[1]
		//label[text()='Tags']/parent::div//input[@class='search']
		actions.moveToElement(Tags).click().sendKeys("Ahemabad",Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("anuja34@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Personal email, Business, Alt...']")).sendKeys("Shops");
		
		WebElement categoryDropdown = driver.findElement(By.xpath("//div[@name='category']"));
		categoryDropdown.click();
		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@name='category']//div[@class='item']")));
		for(WebElement option : options) 
		{
			 if (option.getText().equals("Customer")) {
			        option.click();  // Select the "Customer" option
			        break;
			    }	
		}
		
		WebElement dropDown = driver.findElement(By.xpath("//div[@name='status']"));
		dropDown.click();
		List<WebElement> options1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@name='status']//div[@class='item']")));
		for(WebElement option : options1) 
		{
			 if (option.getText().equals("On Hold")) {
			        option.click();  // Select the "Customer" option
			        break;
			    }	
		}
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Details have been filled");
		
		WebElement dropDown1 = driver.findElement(By.xpath("//div[@name='channel_type']"));
		dropDown1.click();
		List<WebElement> options2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@name='channel_type']//div[@class='visible menu transition']//div[@class='item']")));
		for(WebElement option : options2) 
		{
			 if (option.getText().equals("Yelp")) {
			        option.click();  // Select the "Customer" option
			        break;
			    }	
		}
		
		WebElement DropDown = driver.findElement(By.xpath("//div[@name='timezone']"));
		Select select = new Select(DropDown);
		select.deselectByIndex(1);
		
		
	}

}
