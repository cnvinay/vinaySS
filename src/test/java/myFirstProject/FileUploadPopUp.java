package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) throws AWTException {
	
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //default
//			driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//			driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\VINAY C N\\OneDrive\\Desktop\\Commondata1.property");
//		
		 // custom button
			
//			driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
//			File f= new File(".\\Desktop\\Commondata1.property");
//			String path = f.getAbsolutePath();
//			WebElement ele = driver.findElement(By.xpath("//div[text()='Upload File']"));
//			ele.sendKeys(path);
//			driver.findElement(By.xpath("//div[text()='Upload File']")).click();
			
		// multiple files upload
			driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
			 WebElement ele = driver.findElement(By.xpath("//input[@id='fileInput']"));
					ele.sendKeys(System.getProperty("user.dir")+"/src/main/resources/TY_invitation.pdf");
					ele.sendKeys(System.getProperty("user.dri")+"/src/main/resources/Commondata1.property");

}
}
