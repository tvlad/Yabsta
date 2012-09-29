package desktop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_RegisterAssert extends WebDrInit {

	@Test (groups="assert")
	public void testRegisterAssert() {

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Login")).isEnabled();
		driver.findElement(By.id("looking_in"));
		driver.findElement(By.id("search_phrase"));
		driver.findElement(By.id("location_domain"));
		driver.findElement(By.cssSelector("button.h_search"));
		driver.findElement(By.id("color_locword"));
		driver.findElement(By.cssSelector("div.c_block.width880 > h1"));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='main2']/div/form/table/tbody/tr[2]/th/label"))
						.getText());

		driver.findElement(By.id("registration_first_name"));
		driver.findElement(By.id("registration_login"));
		driver.findElement(By.id("registration_email"));
		driver.findElement(By.id("registration_password"));
		driver.findElement(By.id("registration_password_confirmation"));
		driver.findElement(By.id("registration_location"));
		driver.findElement(By.cssSelector("img.capcha"));
		driver.findElement(By.id("registration_confirm_code"));
		driver.findElement(By.id("registration_terms"));
		driver.findElement(By.cssSelector("button.submit"));
		driver.findElement(By.linkText("About Yabsta"));
		driver.findElement(By.linkText("Advertise With Us"));
		driver.findElement(By.linkText("Site Map"));
		driver.findElement(By.linkText("Legal"));
		driver.findElement(By.linkText("Contacts"));
		driver.findElement(By.cssSelector("#footer > p"));
		driver.findElement(By.cssSelector("img[alt=\"powered by Yabsta\"]"));

		Assert.assertEquals(
				"I have read through and accept the Terms and Conditions",
				driver.findElement(By.cssSelector("span.checkbox_title"))
						.getText());
		System.out.println(driver.findElement(By.cssSelector("span.checkbox_title")).getText());


	}

}
