package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Q2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.aveda.de/");
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		Thread.sleep(2000);
		WebElement facebody = driver.findElement(By.xpath("//div[@id='node-6656']/descendant::a[.='GESICHT & KÖRPER']"));
		Actions a = new Actions(driver);
		a.moveToElement(facebody).perform();
		driver.findElement(By.xpath("(//div[@id='node-6568']/descendant::a[@href='/products/5331/makeup'])[2]")).click();
		
		
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.aveda.de/");
		driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
		WebElement face_body = driver.findElement(By.xpath("//div[@id='node-6656']//a[.='GESICHT & KÖRPER']"));
		Actions act = new Actions(driver);
		act.moveToElement(face_body).perform();
		Thread.sleep(2000);
		WebElement makeup = driver.findElement(By.xpath("//div[@id='node-6656']//a[.='makeup']"));
		act.moveToElement(makeup).click(makeup).perform();
		WebElement allProducts = driver.findElement(By.xpath("//div[@role='listitem']"));
		driver.quit();
*/
	}
}
