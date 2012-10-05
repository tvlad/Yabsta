package desktop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_LoginFunctional extends WebDrInit {
	
	
	@Test (groups="func")
	public void testLoginFunc() throws Exception {
		Random rnd = new Random();
		String rEmail = rnd.randomLogin();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("login_login")).sendKeys(rEmail); //DataProv.getDataProperties("login")
		System.out.println("Login - " + rEmail);
		driver.findElement(By.id("login_password")).sendKeys(DataProv.getDataProperties("password"));
		driver.findElement(By.cssSelector("button.submit.marg19t")).click();
		Assert.assertEquals("Login or password incorrect", driver.findElement(By.cssSelector("p.error")).getText());
	}


}
