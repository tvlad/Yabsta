package desktop;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProTry extends WebDrInit {

	public boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by).isEnabled();
			return true; // Success!
		} catch (NoSuchElementException skip) {
			return false;
		}
	}
	
	@Test
	public void der(){
//		WebElement e = driver.findElement(By.linkText("Login"));
//		System.out.println(e);
//
//		Assert.assertFalse(isElementPresent(driver, By.linkText("Loginn")),	"NoSuchElement");
//
//		isElementPresent(driver, By.linkText("Login"));
//
//		driver.findElement(By.linkText("Loginn"));
//		System.out.println("Element is availible - /Login/");
//		System.out.println(isElementPresent(driver, By.linkText("Loginn")));
//		Assert.assertEquals(e, true);
		
		try {
			boolean el = isElementPresent(driver, By.linkText("Loginn"));
			
			System.out.println(el);
		}
		catch (NoSuchElementException e){
			System.out.println(e);
		}
		
	}
		

}
