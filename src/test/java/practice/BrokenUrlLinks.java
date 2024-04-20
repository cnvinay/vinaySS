package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenUrlLinks {
	public static void main(String[] args)   {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ksrtc.in/oprs-web/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());

		for (WebElement eachLink : allLinks) {
			try {
			String link= eachLink.getAttribute("href");

			URL url= new URL(link);

			HttpURLConnection httpConn= (HttpURLConnection) url.openConnection();
			int statuscode = httpConn.getResponseCode();
			if(statuscode>=400 && statuscode!=0)
			{
				System.out.println(link+" ----> "+statuscode);
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		 
System.out.println("");
	System.out.println("");	
	}



}

