package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://newtours.demoaut.com/");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	System.out.println(allLinks.size());
	for(int i=0; i<allLinks.size(); i++)
	{
		System.out.println("hi");
	}
	
	
}
}
