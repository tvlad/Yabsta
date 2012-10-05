package desktop;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class T_Location_Assert extends WebDrInit {
	@FindBy(css = "#location_domain")
	public List<WebElement> elements;
	private T_Location_Assert page;
	
	
	@Test
	public void locationAss(){
		page = PageFactory.initElements(driver, T_Location_Assert.class);
		//List<WebElement> elements = driver.findElements(By.cssSelector("#location_domain"));
		for (WebElement options : page.elements){
			System.out.println(options.getText());
			}
	}

}
