package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.bigbasket.com/");
	
	driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("apple"+Keys.ENTER);
	
	
	//driver.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::h3/following-sibling::div[@class='flex flex-col false']/descendant::button[.='Add']")).click();
	//driver.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::h3/following-sibling::div[@class='flex flex-col false']/descendant::button[@class='Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton-sc-orwifk-4 NcMAJ group CtaOnDeck___StyledButton-sc-orwifk-4 NcMAJ group']")).click();
	driver.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::h3/following-sibling::div[@class='flex flex-col false']/descendant::div[@class='relative flex flex-col w-full lg:h-8 xl:h-9 overflow-hidden']")).click();
	
	
}	
}
