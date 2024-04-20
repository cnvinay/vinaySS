package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.id("btn30"));

		Actions a= new Actions(driver);
		a.contextClick(button).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();

//		String exptext = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
//		if(exptext.contains("Yes"))
//		{
//			System.out.println("right click done and selected yes");
//		}
//		else
//		{
//			System.out.println("right click done and not selected");
//		}
		driver.quit();
	}
}
