package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
	driver.get("https://www.makemytrip.com/");
	
	Thread.sleep(2000);
	
	//WebElement frame1 = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		
//	driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='April 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='25']")).click();
	
}
}
