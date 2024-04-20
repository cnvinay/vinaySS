package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAndTabs {

public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver =new ChromeDriver();
/*	//for different apps in difft windows
	driver.get("https://www.amazon.in/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.flipkart.in/");
*/
/*	//for different apps in difft tabs
	driver.get("https://www.amazon.in/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/");
*/
/*	//for launching same browser 5times in window
	for(int i=0; i<4; i++)
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
*/	
	//for launching same browser 5times in tab
		for(int i=0; i<4; i++)
		{
			driver.switchTo().newWindow(WindowType.TAB);
		}
	
	
}
	
}
