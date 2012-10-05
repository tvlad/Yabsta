package desktop;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Werr {
	private WebDriver driver;
	private String baseUrl;
		
	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.com.ua/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("automated");
		driver.findElement(By.id("gbqfb")).click();
		Assert.assertEquals("automated", driver.findElement(By.cssSelector("em")).getText());
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
		}
}
