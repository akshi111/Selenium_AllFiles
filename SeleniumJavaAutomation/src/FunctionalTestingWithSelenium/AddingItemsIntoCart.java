package FunctionalTestingWithSelenium;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsIntoCart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshitha\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int j=0;		
		String[] itemsNeeded = {"Cucumber","Mushroom","Orange"};
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//Check whether name you extracted in array list or not
			//Convert array to array list for easy search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			//or List itemsNeededList = Arrays.asList(itemsNeeded);

			
			if(itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// or driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				j++;
				//if(j==3)
				if(j==itemsNeeded.length) {
					break;
				}
			}
			
		}
		
	}

}
