package myFirstProject;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadPopUp {
public static void main(String[] args) throws InterruptedException {
	
// download to particular path/location
	
	ChromeOptions options = new ChromeOptions();
	//
	HashMap<String, Object> hs = new HashMap<String, Object>();
	
	hs.put("download.default_directory", "C:\\Users\\VINAY C N\\OneDrive\\Desktop\\mydownload");
	
	options.setExperimentalOption("prefs", hs);
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoapps.qspiders.com/ui/download");
	driver.findElement(By.id("writeArea")).sendKeys("silent and violent");
	driver.findElement(By.id("downloadButton")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
