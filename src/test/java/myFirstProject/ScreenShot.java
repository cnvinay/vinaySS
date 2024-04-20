package myFirstProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot t= (TakesScreenshot) driver;
		//File src = t.getScreenshotAs(OutputType.FILE);
		File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/ss.png");
		Files.copy(src, des);
		
		
		
		
	}
}