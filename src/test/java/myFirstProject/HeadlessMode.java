package myFirstProject;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {
	public static void main(String[] args) throws AWTException, IOException {

	// opening browser in background
	/*	ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	*/	
	// opening browser in incognito mode
		
	/*  ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	*/
		// opening browser in differnt langauges
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--lang=ne");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}
}
