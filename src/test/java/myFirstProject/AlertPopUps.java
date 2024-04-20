package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		WebElement ele = driver.findElement(By.id("buttonAlert1"));
		ele.click();
		Alert a = driver.switchTo().alert();
		String promtText = a.getText();
		System.out.println(promtText);
		a.sendKeys("yes");
		a.accept();

		String text = driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText();
		System.out.println(text);
		/*or
		if(text.equalsIgnoreCase("You selected yes"))
		{
			System.out.println(text);
		}
		else
		{
			System.out.println(text);
		}*/
	
//		//----------
//		ele.click();
//		a.dismiss();
//		String text1 = driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText();
//		System.out.println(text1);
		
		driver.quit();
	}

}
