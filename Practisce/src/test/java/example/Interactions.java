package example;

import org.example.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class Interactions extends BaseTest {

    @Test
    public void getTitle(){
        chromeDriverSetup();
        driver.get("https://www.selenium.dev/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Selenium");
        close();

    }

    @Test
    public void getCurrentUrl(){
        chromeDriverSetup();
        driver.get("https://www.selenium.dev/");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.selenium.dev/");
        close();
    }
}


