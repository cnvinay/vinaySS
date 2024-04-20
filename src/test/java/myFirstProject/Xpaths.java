package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.get("https://demoapps.qspiders.com/ui?scenario=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		// identifying by using sibling
//		driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("vinay");
//		driver.findElement(By.xpath("//label[text()='Email Id']/following-sibling::input")).sendKeys("vinay@gmail.com");
//		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::section/input")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[text()='Register']")).click();

//		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Amazon miniTV')]")).click();
		
		
		
	}
	
	
}
