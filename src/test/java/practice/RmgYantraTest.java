package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RmgYantraTest {
	public static void main(String[] args) throws InterruptedException, SQLException {
		WebDriver driver= new ChromeDriver();
		Random ran= new Random();
		int random = ran.nextInt(500);
		String expData= "MEDVITE"+random ;
		
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();

		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expData);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("vinay cn");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Project Status ']/following-sibling::select[@name='status']"));
		Select s = new Select(ele);
		s.selectByValue("On Going");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

		//step1 register driver
		Driver driver1 = new Driver();
		DriverManager.registerDriver(driver1);

		//step2 get connection for database
		Connection conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");

		//step3 create statement

		Statement state = conn.createStatement();
		String query= "select * from project where lower(project_name='"+expData+"');";

		// step4 execute query
		ResultSet result = state.executeQuery(query);
		System.out.println(result.getMetaData());

		while(result.next())
		{
			String actData = result.getString(4);
			if(actData.equalsIgnoreCase(expData))
			{
				System.out.println("Data is present");
			}
			else
			{
				System.out.println("Data is not present");
			}
		}
		
		// close database connection
		
		conn.close();

driver.quit();
	}
}
