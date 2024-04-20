package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ReadDataFromCommondLineTest {

	@Test
	public void readData()
	{ 
		WebDriver driver = null;
		String BROWSER = System.getProperty("browser");
		String USER = System.getProperty("user");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) 
		{
			driver= new EdgeDriver();
		}
		else {
			System.out.println("invalid browser");
		}

	
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		if(USER.equalsIgnoreCase("admin"))
		{
			driver.findElement(By.xpath("//h3[.='Admin Login']/parent::div[@class='text list_1_of_2']//child::a[.='Click Here']")).click();
			driver.findElement(By.name("username")).sendKeys(USERNAME);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			driver.findElement(By.name("submit")).click();
		}
	}	
}
