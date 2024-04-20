package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverIcon {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0&scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement icon = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Actions a= new Actions(driver);
		a.moveToElement(icon).perform();
		String text = driver.findElement(By.xpath("//ul[@class='p-4']")).getText();
		System.out.println(text);
		
		System.out.println("--------OR-----------");
		//or
		List<WebElement> option = driver.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']"));
		for (WebElement ele : option) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}
}