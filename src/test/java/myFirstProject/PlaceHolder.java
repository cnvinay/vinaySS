package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolder {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("name"));
		String text = ele.getAttribute("placeholder");
	
		System.out.println(text);
		if(text.equalsIgnoreCase("Enter your name"))
		{
			System.out.println("place holder is present");
		}
		else 
		{
			System.out.println("place holder is not present");
		}
		driver.quit();
	}
}
