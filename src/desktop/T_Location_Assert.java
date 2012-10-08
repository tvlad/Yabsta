package desktop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_Location_Assert extends WebDrInit {
	// @FindBy(css = "#location_domain")
	@FindBy(tagName = "option")
	public List<WebElement> elements;
	private T_Location_Assert page;

	@Test
	public void locationAss() {
		page = PageFactory.initElements(driver, T_Location_Assert.class);
		// List<WebElement> elements =
		// driver.findElements(By.cssSelector("#location_domain"));

		List<String> list = new ArrayList<String>();
		File file = new File("listLocation.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			while (s != null) {
				list.add(s);
				s = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("-------");

		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-------");

//		for (WebElement options : page.elements) {
//			System.out.println(options.getText());
//			System.out.println("----------");
//		}
		
		List<String> listWeb = new ArrayList<String>(); 
		for (WebElement option : page.elements){
			listWeb.add(option.getText());
//			System.out.println(listWeb.size());
			System.out.println(option.getText());
		}
		
		Assert.assertTrue(list.equals(listWeb));
	}

}
