package desktop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T_LoginAssert extends WebDrInit {
	
	@Test (groups="assert")
	public void testLoginAssert() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("logo"));
		driver.findElement(By.linkText("Login"));
		driver.findElement(By.linkText("Register"));
		driver.findElement(By.id("looking_in"));
		driver.findElement(By.id("search_phrase"));
		driver.findElement(By.id("location_domain"));
		driver.findElement(By.cssSelector("button.h_search"));
		driver.findElement(By.id("color_locword"));
		driver.findElement(By.cssSelector("div.c_block.width880 > h1"));
		driver.findElement(By.id("login_login"));
		driver.findElement(By.id("login_password"));
		driver.findElement(By.id("login_remember"));
		driver.findElement(By.cssSelector("p > a"));
		driver.findElement(By.linkText("Click here"));
		driver.findElement(By.cssSelector("#facebook_button > h1"));
		driver.findElement(By.cssSelector("#facebook_button > h1"));
		driver.findElement(By.cssSelector("button.submit.marg19t"));
		driver.findElement(By.linkText("About Yabsta"));
		driver.findElement(By.linkText("Advertise With Us"));
		driver.findElement(By.linkText("Site Map"));
		driver.findElement(By.linkText("Site Map"));
		driver.findElement(By.linkText("Legal"));
		driver.findElement(By.linkText("Contacts"));
	}

}
