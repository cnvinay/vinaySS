package myFirstProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/VINAY%20C%20N/OneDrive/Desktop/hotelmenu.html");
	WebElement ele = driver.findElement(By.id("mtr"));
	Select s= new Select(ele);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	ArrayList<String> al= new ArrayList<String>();
	for(int i=0; i<count; i++)
	{
		String text= options.get(i).getText();
		al.add(text);
		
	}
	
	Collections.sort(al);
	for(String as : al)
	{
		System.out.println(as);
	}
	System.out.println("-------------------");
	
	Collections.reverse(al);
	for(String ds : al)
	{
		System.out.println(ds);
	}
			
}
}
