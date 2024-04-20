package practice;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDataFromPropertyFileTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		WebDriver driver = null;
		FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.Properties");
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("browser");
		String	URL= p.getProperty("url");
		String	USER1= p.getProperty("user1");
		String USERNAME1 = p.getProperty("adminusername");
		String	PASSWORD1= p.getProperty("adminpassword");
		String	USER2= p.getProperty("user1");
		String USERNAME2 = p.getProperty("");
		String	PASSWORD2= p.getProperty("");
		
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
		
		Thread.sleep(8000);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		if(USER1.equalsIgnoreCase("admin"))
		{
			driver.findElement(By.xpath("//h3[.='Admin Login']/parent::div[@class='text list_1_of_2']//child::a[.='Click Here']")).click();
			driver.findElement(By.name("username")).sendKeys(USERNAME1);
			driver.findElement(By.name("password")).sendKeys(PASSWORD1);
			driver.findElement(By.name("submit")).click();
			
		}
		else if (USER2.equalsIgnoreCase("doctor")) {
			driver.findElement(By.xpath("//h3[.='Doctors Login']/parent::div[@class='text list_1_of_2']//descendant::a[.='Click Here']")).click();
		}
		else {
			driver.findElement(By.xpath("//h3[.='Patients']/parent::div[@class='text list_1_of_2']//descendant::a[.='Click Here']")).click();

		}
		
		
		/*
		 //url 
		 http://rmgtestingserver/domain/Hospital_Management_System/

		//admin
		driver.findElement(By.xpath("//h3[.='Admin Login']/parent::div[@class='text list_1_of_2']//child::a[.='Click Here']")).click();
		// doctor
		driver.findElement(By.xpath("//h3[.='Doctors Login']/parent::div[@class='text list_1_of_2']//descendant::a[.='Click Here']")).click();
		//patient
		driver.findElement(By.xpath("//h3[.='Patients']/parent::div[@class='text list_1_of_2']//descendant::a[.='Click Here']")).click();
		*/
		
	}

}
