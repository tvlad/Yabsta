package desktop;

import static org.junit.Assert.fail;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;

public class WebDrInit {
	
	
	protected static WebDriver driver;
	public  String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	

	@BeforeClass
	
	
	public void setUp() throws Exception {
		//driver = new InternetExplorerDriver();
		//driver = new OperaDriver();
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		
				
		baseUrl = "http://home.yabsta.net";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		
	}
		
		@AfterClass
		public void tearDown() throws Exception {
			driver.quit();
			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				fail(verificationErrorString);
			}

		}
		
}
