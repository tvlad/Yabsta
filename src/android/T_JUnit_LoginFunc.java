package android;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;


public class T_JUnit_LoginFunc extends TestCase {
	
		
	public static void testLoginFunc() throws Exception {
		WebDriver driver = new AndroidDriver();
		driver.get("http://home.yabsta.net");
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());	
		driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		driver.findElement(By.id("login_login")).sendKeys("wiara");
		driver.findElement(By.id("login_password")).sendKeys("tradiskancia");
		driver.findElement(By.className("login-btn")).click();
		assertEquals("Login or password incorrect", driver.findElement(By.cssSelector("p.error")).getText());
		
//		 driver.quit();
	}

}
