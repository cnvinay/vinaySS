package myFirstProject;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import net.bytebuddy.matcher.CollectionOneToOneMatcher;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// entering valid data into all text fields 
		WebElement phone = driver.findElement(By.id("select1"));
		Select s= new Select(phone);
		
		s.selectByValue("+91");
		driver.findElement(By.id("phone")).sendKeys("9964023912");
		WebElement gender = driver.findElement(By.id("select2"));
		Select s1= new Select(gender);
		s1.selectByIndex(1);
		WebElement country = driver.findElement(By.id("select3"));// country by visibleText
		Select s2= new Select(country);
		s2.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("select5"));// state by value
		Select s3= new Select(state);
		s3.selectByValue("Karnataka");
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/../select"));//city by index
		Select s4= new Select(city);
		s4.selectByIndex(15);

		driver.findElement(By.id("select7")).click();
		driver.findElement(By.xpath("//option[text()='4']")).click();
		driver.findElement(By.id("continuebtn")).click();






		/*
		List<WebElement> options = s3.getOptions();
		int count= options.size();
		for(int i=1; i<count; i++)//printing
		{
			String text= options.get(i).getText();
			System.out.println(text);
		}
		// assending order
		System.out.println("------------------------");
		ArrayList<String> al= new ArrayList<String>();

		for(int i=0; i<count; i++)
		{
			String text1= options.get(i).getText();
			al.add(text1);
		}
		Collections.sort(al);

		for(String asd : al) {
			System.out.println(asd);
		}  /// for tree set use descendingIterator
		// descending
		System.out.println("-----------------");

		Collections.sort(al,Collections.reverseOrder()); 
		for(String dse : al) {
			System.out.println(dse);
		}*/
		//driver.quit();
	}
}