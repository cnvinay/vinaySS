package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		/*//single frame
		d.get("https://demoapps.qspiders.com/ui/frames");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(frame);
		d.findElement(By.id("username")).sendKeys("vinay");
		 */
		/*// nested frames
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1&scenario=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mainFrame = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(mainFrame);
		WebElement childFrame = d.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		d.switchTo().frame(childFrame);

		d.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		d.findElement(By.id("submitButton")).click();
		 */
		/*// coping text from one frame into another frame
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mainFrame = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(mainFrame);

		String gmail = d.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();

		WebElement childFrame = d.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		d.switchTo().frame(childFrame);
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(gmail);

		d.switchTo().parentFrame();

		String password= d.findElement(By.xpath("(//p[.='Admin@1234'])[1]")).getText();
		d.switchTo().frame(childFrame);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

		d.switchTo().parentFrame();
		String conformPassword= d.findElement(By.xpath("(//p[.='Admin@1234'])[2]")).getText();
		d.switchTo().frame(childFrame);
		d.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(conformPassword);

		d.findElement(By.id("submitButton")).click();
		 */
		/*// multiple frames

		d.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement frame1 = d.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		d.switchTo().frame(frame1);

		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		d.findElement(By.id("submitButton")).click();

		d.switchTo().defaultContent();

		//d.switchTo().frame(1); OR

		WebElement frame2 = d.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		d.switchTo().frame(frame2);

		d.findElement(By.id("username")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("submitButton")).click();
		 */
		// multiple nested frames
		d.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement mainFrame = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(mainFrame);

		String gmail = d.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();

		WebElement childFrame = d.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		d.switchTo().frame(childFrame); //or index 0 
		d.switchTo().frame(0);
		d.findElement(By.id("email")).sendKeys(gmail);
		d.switchTo().defaultContent();
		d.switchTo().frame(mainFrame);

		String password= d.findElement(By.xpath("//p[.='Admin@1234']")).getText();
		d.switchTo().frame(childFrame);
		d.switchTo().frame(1);
		d.findElement(By.id("password")).sendKeys(password);
		d.switchTo().defaultContent();
		d.switchTo().frame(mainFrame);
		String confirmPass = d.findElement(By.xpath("(//p[.='Admin@1234'])[2]")).getText();
		d.switchTo().frame(childFrame);
		d.switchTo().frame(2);
		d.findElement(By.id("confirm")).sendKeys(confirmPass);
		d.switchTo().parentFrame();
		d.switchTo().frame(3);
		d.findElement(By.id("submitButton")).click();

		d.quit();

	}
}
