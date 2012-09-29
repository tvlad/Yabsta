package desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_RegisterFuctional extends WebDrInit {
	
	@Test (groups="func", dataProvider="groupDate", dataProviderClass=DataProv.class)
	public void testRegisterFuctional(String first_name, String last_name, String login, String email) throws Exception {
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("registration_first_name")).sendKeys(first_name);
		driver.findElement(By.id("registration_last_name")).sendKeys(last_name);
		driver.findElement(By.id("registration_login")).sendKeys(login);
		driver.findElement(By.id("registration_email")).sendKeys(email);
		driver.findElement(By.id("registration_password")).sendKeys("qwer1234");
		driver.findElement(By.id("registration_password_confirmation")).sendKeys("qwer1234");
		new Select(driver.findElement(By.id("registration_location"))).selectByVisibleText("Kiev");
		driver.findElement(By.id("registration_terms")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		Assert.assertEquals("Required.", driver.findElement(By.cssSelector("li")).getText());
		
	}


}
