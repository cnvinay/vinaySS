package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	WebElement frame = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vinay");
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
	WebElement mainFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo();
		
		
		
}
	
}
