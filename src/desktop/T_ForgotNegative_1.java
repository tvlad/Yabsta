package desktop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_ForgotNegative_1 extends WebDrInit {
	
	@Test (groups="func")
	public void testLoginNeg1() throws Exception {
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Click here")).click();
		Assert.assertEquals("Forgot Password", driver.findElement(By.cssSelector("div.c_block.width880 > h1")).getText());
		driver.findElement(By.id("forgot_email")).sendKeys("hzpxorep@gmail.com"); //hzpxorep@gmail.com
		driver.findElement(By.cssSelector("button.submit")).click();
		Assert.assertEquals("The user with the Login/Email Address you specified does not exist", 
				driver.findElement(By.cssSelector("p.error")).getText());
	}

}
