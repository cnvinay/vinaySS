package myFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import GenaricUtilities.WebdriverUtilities;

public class WindowHandle {
	public static void main(String[] args) {
	/*
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.findElement(By.id("browserButton3")).click();
		
		WebdriverUtilities w = new WebdriverUtilities();
		w.switchWindow(driver, "SignUp");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.close();
		
		w.switchWindow(driver, "Login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
		
		w.switchWindow(driver, "SignUpPage");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.close();
	driver.quit();
	*/
	
	
	// IRCTC APP
	 ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
	driver.findElement(By.xpath("//label[text()='BUSES']")).click();
	
	WebdriverUtilities w= new WebdriverUtilities();
	w.switchWindow(driver, "home");
	
//	Set<String> whs = driver.getWindowHandles();
//	
//			for(String wh : whs)
//			{
//				driver.switchTo().window(wh);		
//			}
	driver.findElement(By.id("departFrom")).sendKeys("bangalore");
	driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	driver.findElement(By.id("goingTo")).sendKeys("Delhi");
	driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	//driver.close();
	
//	w.switchWindow(driver, "train-search");
//	driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
//	driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
//	
	
	
}
}