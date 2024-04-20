package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		Thread.sleep(5000);
		String expCon = "Sri Lanka";
		List<WebElement> countries = driver.findElements(By.xpath("//span[@class='si-fname si-text']"));

		int count=0;
		for (int i = 0; i < countries.size(); i++)
		{
			String actCont = countries.get(i).getText();
			
			if(actCont.equalsIgnoreCase(expCon))
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println(expCon+ " is present");
		}
		else
		{
			System.out.println(expCon+ " is not present");

		}

	}
}
