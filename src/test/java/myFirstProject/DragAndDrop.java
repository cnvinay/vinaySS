package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//multiple drag and drop
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement lCharger = driver.findElement(By.id("dragElement1"));
		 lCharger.click();
		 int x1 = lCharger.getLocation().getX();
		 WebElement lCover = driver.findElement(By.id("dragElement3"));
		 lCover.click();
		 int y1= lCover.getLocation().getY();
	
		WebElement laptopAcc = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions a= new Actions(driver);
	
		
		
		
		
		
		//single element drag and drop
//		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement s1 = driver.findElement(By.xpath("//*[text()='Mobile Charger']"));
//		WebElement t1 = driver.findElement(By.xpath("//*[text()='Mobile Accessories']"));
//		WebElement s2 = driver.findElement(By.xpath("//*[text()='Mobile Cover']"));
//		WebElement t2 = driver.findElement(By.xpath("//*[text()='Mobile Accessories']"));
//
//		WebElement s3 = driver.findElement(By.xpath("//*[text()='Laptop Charger']"));
//		WebElement t3 = driver.findElement(By.xpath("//*[text()='Laptop Accessories']"));
//		WebElement s4 = driver.findElement(By.xpath("//*[text()='Laptop Cover']"));
//		WebElement t4 = driver.findElement(By.xpath("//*[text()='Laptop Accessories']"));
//
//		Actions a= new Actions(driver);
//		a.dragAndDrop(s1, t1).perform();
//		a.dragAndDrop(s2, t2).perform();
//		a.dragAndDrop(s3, t3).perform();
//		a.dragAndDrop(s4, t4).perform();
		
	
		
		
	}
}