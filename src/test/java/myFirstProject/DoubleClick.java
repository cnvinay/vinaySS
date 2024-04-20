package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.id("btn20"));

		Actions a= new Actions(driver);
		a.doubleClick(button).perform();
		//driver.quit();
// submit button
		driver.findElement(By.xpath("//*[text()='Submit Click']")).click();
		driver.findElement(By.xpath("//input[@id='r4']")).click();
		driver.findElement(By.id("btn42")).click();
		String actText = "You Selected 4";
		boolean ele = driver.findElement(By.xpath("//*[text()='You Selected \"4\"']")).isDisplayed();		
		if(ele)
		{
			System.out.println(actText);
		}
		else
		{
			System.out.println("not displayed");
		}
		driver.quit();
	}
}
