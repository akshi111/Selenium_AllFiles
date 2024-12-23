package example;

import org.example.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class Navigations extends BaseTest {

    String title;

    @Test
    public void navigateBrowser(){
        //navigate to
        chromeDriverSetup();
        driver.get("https://www.selenium.dev/");
        driver.navigate().to("https://www.selenium.dev/");
        title = driver.getTitle();
        Assert.assertEquals(title,"Selenium");

        //backward
        driver.navigate().back();
        title = driver.getTitle();
        Assert.assertEquals(title,"Selenium");

        //forward
        driver.navigate().forward();
        title = driver.getTitle();
        Assert.assertEquals(title,"Selenium");

        //refresh
        driver.navigate().refresh();
        title = driver.getTitle();
        Assert.assertEquals(title, "Selenium");

        close();

    }
}
