package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rbi {
	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rbi.org.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		//		int count = 0;
		
		for (WebElement eachLink : allLinks) 
		{
				String link = eachLink.getAttribute("href");
				
				URL url = null;
				int statusCode = 0;
				
				try {
				url = new URL(link);
				
				HttpURLConnection httpConn= (HttpURLConnection) url.openConnection();
			
				statusCode = httpConn.getResponseCode();


				if(statusCode>400) {
					System.out.println(link +" ---> "+ statusCode);
					//					count++;
					//System.out.println(10);
				}

				}catch (Exception e) 
				{
					
				}

		}
		//		System.out.println(count);
	}
}
