package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		
		//ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Web Automation Results");
		reporter.config().setReportName("test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
		
		
	}
	
	@Test
	public void initialDemo() {
		ExtentTest test = extent.createTest("InitialDemo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
//		test.addScreenCaptureFromBase64String(); this is to capture screenshot
		driver.close();
		test.fail("Results don't match");
		extent.flush();
		
	}

}
