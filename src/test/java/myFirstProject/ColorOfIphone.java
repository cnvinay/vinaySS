package myFirstProject;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOfIphone {
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	/* driver.get("https://www.amazon.in/"); 
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
	driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - Blue']")).click();
	Set<String> windows= driver.getWindowHandles();
	
	for( String wh: windows)
	{
		driver.switchTo().window(wh);
		
	}
	List<WebElement> allColors = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
	for (WebElement color : allColors) {
		System.out.println(color.getAttribute("alt"));
	}
	
	*/
	// cssvalue
	driver.get("https://www.facebook.com/");
	 WebElement log = driver.findElement(By.xpath("//button[.='Log in']"));
	 
				 System.out.println(log.getCssValue("color"));
				 System.out.println(log.getCssValue("font-style"));
				 System.out.println(log.getCssValue("font-size"));
				 System.out.println(log.getCssValue("height"));
				 System.out.println(log.getCssValue("background-color"));
				 System.out.println("font-family");
				 System.out.println("font-weight");
				 System.out.println("text-align");
				// System.out.println(log.getAttribute("name"));
			
			System.out.println("----------------------");
		WebElement pass = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
				
				System.out.println(pass.getCssValue("color"));
				System.out.println(pass.getCssValue("font-style"));
				System.out.println(pass.getCssValue("font-size"));
				System.out.println(pass.getCssValue("height"));
				System.out.println(pass.getCssValue("background-color"));
				System.out.println("font-family");
				System.out.println("font-weight");
				System.out.println("text-align");
				//System.out.println(pass.getAttribute("href"));
				
	driver.quit();

}
}
