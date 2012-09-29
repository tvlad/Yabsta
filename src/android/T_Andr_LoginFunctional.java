package android;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_Andr_LoginFunctional extends AndrWebDriverInit {
	
	@Test (groups="func")
	public void testLoginFunc() throws Exception {
		
		
		System.out.println(driver.getTitle());
			
		System.out.println(driver.getPageSource());
//		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//		driver.findElement(By.id("login_login")).sendKeys("wiara");
//		driver.findElement(By.id("login_password")).sendKeys("tradiskancia");
//		driver.findElement(By.cssSelector("button.submit.marg19t")).click();
//		Assert.assertEquals("Login or password incorrect", driver.findElement(By.cssSelector("p.error")).getText());
	}

}
