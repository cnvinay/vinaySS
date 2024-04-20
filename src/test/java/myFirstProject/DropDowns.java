package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement phone = driver.findElement(By.id("select1"));
		Select s= new Select(phone);
		s.selectByValue("+91");
		driver.findElement(By.id("phone")).sendKeys("9964023912");
		WebElement gender = driver.findElement(By.id("select2"));
		Select s1= new Select(gender);
		s1.selectByIndex(0);
		WebElement country = driver.findElement(By.id("select3"));
		Select s2= new Select(country);
		s2.selectByIndex(7);
		WebElement state = driver.findElement(By.id("select5"));
		Select s3= new Select(state);
	//	s3.selectByValue("");
		 
		
}
}