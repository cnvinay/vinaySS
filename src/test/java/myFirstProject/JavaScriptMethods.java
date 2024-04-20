package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor js= (JavascriptExecutor)driver;

	/*
	 //lanching application without get()
	//js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
	  
	//scroll till bottom of the page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	Thread.sleep(2000);
	//scroll till top of the page
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

//	sendkeys  -to search button in amazon or for disabled
	

	//click on element
	WebElement ele1 =driver.findElement(By.xpath("//a[.='Sell']"));
	js.executeScript("arguments[0].click()", ele1);
	
	// scroll till element
	 WebElement ele2 =driver.findElement(By.xpath("//a[.='abc']"));
	 js.executeScript("arguments[0].scrollIntoView()", ele2);
	*/
	
// get the text
	WebElement ele1= driver.findElement(By.id("twotabsearchtextbox"));
	js.executeScript("arguments[0].value=arguments[1]", ele1, "iphone");
	
//WebElement ele= driver.findElement(By.id("nav_avod_desktop_topnav"));
//String text = (String) js.executeScript("return arguments[0].value;", ele);
//	System.out.println(text);
//	driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
