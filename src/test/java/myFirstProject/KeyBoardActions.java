package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {
	public static void main(String[] args) throws AWTException, IOException {
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
	// by keysnum
		/*driver.findElement(By.id("email")).sendKeys("Admin12@gmail.com" + Keys.CONTROL + "ac");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.id("confirmPassword")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.xpath("//button[.='Press Enter to Submit']")).click();
		*/
	// by robot class
	/*	driver.findElement(By.id("email")).sendKeys("Admin12@gmail.com");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	*/
	// enter in capital
		
	/*	
		Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_CAPS_LOCK);
		driver.findElement(By.id("email")).sendKeys("Admin12@gmail.com".toUpperCase());
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		*/
		/*// opening task manager
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	*/	
	/*	// closing current window 
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_W);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
	*/
	/*	// closing current window without lanching browser
		
		Runtime r = Runtime.getRuntime();
		Process pro = r.exec("taskkill /im edge.exe /f /t");
		//Process pro = r.exec("taskkill /im chrome.exe /f /t");
	*/
		
		
		
		
}
}