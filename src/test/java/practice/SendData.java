package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendData {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().window().maximize();

	driver.get("https://selectorshub.com/xpath-practice-page/");
	
	WebElement showRootEle = driver.findElement(By.xpath("//div[@id='userName']"));
	Thread.sleep(5000);
	SearchContext shadow = showRootEle.getShadowRoot();
	shadow.findElement(By.id("kils")).sendKeys("vinay");
	Thread.sleep(5000);
	
	
	WebElement showRootEle2 = shadow.findElement(By.cssSelector("#app2"));
	Thread.sleep(5000);
	SearchContext shadow2 = showRootEle2.getShadowRoot();
	
	shadow2.findElement(By.id("pizza")).sendKeys("vaishali");
	
}
}
