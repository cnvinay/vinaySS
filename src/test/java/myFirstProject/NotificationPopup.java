package myFirstProject;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws AWTException {
	
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
//	driver.findElement(By.id("browNotButton")).click();
//	
	
	
	
	// IRCTC APP
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
	driver.findElement(By.xpath("//label[text()='BUSES']")).click();
	
	Set<String> whs = driver.getWindowHandles();

			for(String wh : whs)
			{
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				if(title.contains("Online Bus ticket"))
				{
					break;
				}
				
				
			}
	driver.findElement(By.id("departFrom")).sendKeys("bangalore");
	driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	driver.findElement(By.id("goingTo")).sendKeys("Delhi");
	driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	
	driver.findElement(By.xpath("//input[@id='departDate']")).click();
	driver.findElement(By.xpath("//span[text()='Next']")).sendKeys("");
	

	
	
	//driver.quit();
}
}
