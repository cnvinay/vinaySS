package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shirt");
		List<WebElement> suggs = driver.findElements(By.xpath("//a[@class='oleBil']"));
		int count= suggs.size();
		System.out.println(count);
		for(int i=0; i<count; i++ )
		{
			String text= suggs.get(i).getText();
			System.out.println(text);
			if(text.contains("shirt for men"))
			{
				
			}
		}
		
		
		
}
}