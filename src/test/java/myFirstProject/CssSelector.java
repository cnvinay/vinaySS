package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#name")).sendKeys("vinay");
		//driver.findElement(By.cssSelector(".bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5  dark:placeholder-gray-400 focus:bg-[rgb(240,240,240)] disabled:opacity-50 disabled:cursor-not-allowed")).sendKeys("vinay");
		//driver.findElement(By.cssSelector("([id='name'][name='name'])")).sendKeys("vinay");
		
		
		
	}
}
