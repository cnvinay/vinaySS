package myFirstProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

public class Synchronization {
public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();

WebElement ele= driver.findElement(By.id("gdgh"));

// implicity wait
	// V3
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//V4
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//explicit wait	
	//v3
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeSelected(ele));
	//V4
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	
/*
 //fluent wait
	FluentWait wait1 = new FluentWait(driver);
	wait1.pollingEvery(Duration.ofMillis(1000));
	wait1.withTimeout(Duration.ofSeconds(10));
	wait1.ignoring(Exception.class);
	wait1.until(ExpectedConditions.elementToBeClickable(ele));
*/
// custom wait
	
	int count=0;
	while(count<20)
	{
		try {
			ele.click();
			break;
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
			count++;
		}
	}	
}
}
