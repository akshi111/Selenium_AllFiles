package example;

import org.example.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts extends BaseTest {

    @Test
    public void testForAlerts() {
        chromeDriverSetup();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

        //simple alert
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Sample Alert')");
        Alert alert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        Assert.assertEquals(text,"Sample Alert");
        alert.accept();

        //confirm
        js.executeScript("confirm('Are you sure?)");
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        text = alert.getText();
        Assert.assertEquals(text, "Are you sure?");
        alert.dismiss(); //press cancel button

        //prompt
        js.executeScript("prompt('What is your name?');");
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        text = alert.getText();
        Assert.assertEquals(text,"What is your name?");
        alert.accept();

        close();
    }

}
