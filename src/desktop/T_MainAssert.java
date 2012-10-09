package desktop;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import desktop.Screen;

public class T_MainAssert extends WebDrInit {
	
		
	public static boolean isElementPresent(WebDriver driver, By by) {
		  try {
		    driver.findElement(by);
		    return true;  // Success!
		  } catch (NoSuchElementException ignored) {
		    return false;
		  }
		}
	
	
	@Test (groups="assert")
	public void testMainAssert() throws IOException {
		
//		((RemoteWebDriver) driver).setLogLevel(Level.INFO);
		
		isElementPresent(driver, By.linkText("Login"));
		
				
		Assert.assertEquals("Yabsta.com ...local word of mouth", driver.getTitle());
		driver.findElement(By.linkText("Login")).isEnabled();
		driver.findElement(By.linkText("Register"));
//		System.out.println(driver.findElement(By.linkText("Register")));
		driver.findElement(By.cssSelector("a.logo > img"));
		driver.findElement(By.id("search_phrase_input"));
		driver.findElement(By.id("location_domain"));
		driver.findElement(By.cssSelector("button.h_search"));
		driver.findElement(By.id("video_arr"));
		driver.findElement(By.linkText("Kiev"));
		driver.findElement(By.linkText("About Yabsta"));
		driver.findElement(By.linkText("Advertise With Us"));
		driver.findElement(By.linkText("Site Map"));
		driver.findElement(By.linkText("Legal"));
		driver.findElement(By.linkText("Contacts"));
		driver.findElement(By.cssSelector("#footer > ul"));
		driver.findElement(By.cssSelector("#footer > p"));
		boolean a1 = driver.findElement(By.cssSelector("img[alt=\"powered by Yabsta\"]")).isEnabled();
		System.out.println(a1);
		Assert.assertEquals(true, a1);
		Screen.testScreen(driver, "MainScreen");

	}

	
}
