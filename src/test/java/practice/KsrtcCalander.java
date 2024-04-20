package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcCalander {

	public static void main(String[] args) {

		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("bang");
		driver.findElement(By.xpath("//a[text()='BANGALORE AIRPORT']")).click();
		driver.findElement(By.id("toPlaceName")).sendKeys("has");
		driver.findElement(By.xpath("//a[text()='HASSAN']")).click();
		int date=20;
		String month = "April";
		driver.findElement(By.id("txtJourneyDate")).click();
//		for(;;)
		
			try {
				WebElement exp = 
		driver.findElement(By.xpath("//span[text()='"+month+"']/ancestor::div[@id='ui-datepicker-div']/descendant::a[text()='"+date+"']"));
				exp.click();
			}
			catch (Exception e) {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		
		}
	


	}

}
