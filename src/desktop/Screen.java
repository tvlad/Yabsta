package desktop;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screen {
	
	public static void testScreen(WebDriver driver, String s_name) throws IOException {

		File screenshot1 = new File("D:/MyDoc/Java-test/Yabsta/Screen/" + s_name + ".png");// C:/temp/screenshot1.png
		screenshot1.delete();
		File screenshotTempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotTempFile, screenshot1);

//		File screenshot2 = new File("C:/temp/screenshot2.png");
//		screenshot2.delete();
//		byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		BufferedImage image = ImageIO.read(new ByteArrayInputStream(screenshotBytes));
//		ImageIO.write(image, "png", screenshot2);
		
	}
}