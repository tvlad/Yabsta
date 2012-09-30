package android;

import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;


public class JUnit_init {
	
	protected static WebDriver driver;
	public  String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	

	@BeforeClass
	public void setUp() throws Exception {
		WebDriver driver = new AndroidDriver();
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
