package desktop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_VideoFunctional extends WebDrInit {
	
	
	@Test (groups="func")
	public void testVideoFunc() {
		
		driver.findElement(By.id("video_arr")).click();
		driver.findElement(By.xpath("//div[@id='video_container_945']/div[3]/div/div")).click();
		driver.findElement(By.id("video_arr")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='video_container_945']/div[3]/div")).isDisplayed());
	}


}
