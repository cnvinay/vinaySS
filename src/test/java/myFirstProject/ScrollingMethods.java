package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor)driver;
/* // by using java script
		//click on element
		WebElement ele = driver.findElement(By.xpath("//a[.='Best Sellers']"));
		js.executeScript("arguments[0].click()", ele);

		//scroll till bottom		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,0)"); // next step will work without this line
		Thread.sleep(3000);
		//scroll till element
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='action-inner']"));
		js.executeScript("arguments[0].scrollIntoView()", ele1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", ele1);

		// sendkeys
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='ap_email']"));
		js.executeAsyncScript("arguments[0].value=arguments[1]", ele2, "9964023912");
		driver.quit();
*/
// by using actions class
		
		Actions a= new Actions(driver);
		

		/*	int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();

	Actions a= new Actions(driver);
		//		a.scrollByAmount(x, y).perform();
		//or
		a.scrollToElement(ele).perform();
		 */
	}
}