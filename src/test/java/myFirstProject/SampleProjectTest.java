package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProjectTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		String t = driver.getTitle();
//		String u = driver.getCurrentUrl();
//		String p = driver.getPageSource();
//	 String w = driver.getWindowHandle();
//		driver.manage().window().maximize();
//		driver.navigate().refresh();
//		System.out.println(t);
//		System.out.println(u);
//		System.out.println(p);
//		System.out.println(w);
//		driver.quit();
//	 WebElement ele = driver.findElement(By.xpath("djkd"));
//	 ele.getAccessibleName();
//	 ele.getAriaRole();
//	 ele.getDomAttribute(w);
//	 ele.getDomProperty(w);
//	 ele.getShadowRoot();
	 
	//  WebElement countryBox = 
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
			  driver.findElement(By.xpath("//select[@id='select3']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//option[text()='United Arab Emirates']")).click();
			  
	}
}
