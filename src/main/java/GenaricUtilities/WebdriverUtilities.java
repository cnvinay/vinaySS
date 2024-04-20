package GenaricUtilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebdriverUtilities {

	public void switchWindow(WebDriver driver, String url)
	{
		Set<String> windows = driver.getWindowHandles();
		for(String wh : windows)
		{
			driver.switchTo().window(wh);
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains(url))
			{
				break;
			}
		}
	}
	
}
