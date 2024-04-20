package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysByActionsClass {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		Actions a= new Actions(driver);
		a.sendKeys(ele, "vinay").perform();
		// or
		// a.click(ele).sendKeys("vinay").perform();


	}
}