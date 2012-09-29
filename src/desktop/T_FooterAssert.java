package desktop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T_FooterAssert extends WebDrInit{
	
	@Test (groups="assert")
	public void testFooterAssert() throws Exception {
		
		driver.findElement(By.cssSelector("#footer > ul"));
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("#footer > ul"));
		driver.findElement(By.linkText("Click here")).click();
		driver.findElement(By.cssSelector("#footer > ul"));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("#footer > ul"));
	}

}
