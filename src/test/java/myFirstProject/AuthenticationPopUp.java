package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String username= "admin";
		String password= "admin";
		String url= "https://"+username+ ":" +password+ "@" + "basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
//		driver.get(url);
		
//		OR
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		String text = driver.findElement(By.xpath("//*[text()='congratulations with valid credentials']")).getText();
		System.out.println(text);
		driver.quit();
	}

	
}
