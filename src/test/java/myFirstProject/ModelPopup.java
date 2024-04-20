package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ModelPopup {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("use-fake-ui-for-media-stream");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.findElement(By.id("multiModalButton")).click();
		driver.findElement(By.id("multiClosemodal")).click();
		String text = driver.findElement(By.xpath("//p[contains(.,'This')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//p[contains(.,'This')]/../following-sibling::section/button")).click();
		driver.findElement(By.id("multiclose2")).click();
		driver.quit();
		*/
	//	Mic popup
		driver.get("https://mictests.com/");
		driver.findElement(By.id("mic-launcher")).click();
		
		
		
		
}
}