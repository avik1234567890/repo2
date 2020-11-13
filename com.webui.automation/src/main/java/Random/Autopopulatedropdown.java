package Random;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autopopulatedropdown {

	public static void main(String[] args) {
		//Autopopulate dropdown
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().deleteAllCookies();
	d.get("https://rahulshettyacademy.com/dropdownsPractise/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	d.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	List<WebElement> country=d.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement options :country)
	{
		if(options.getText().equalsIgnoreCase("India"))
				{
					options.click();
					break;
				}
	}
	
	}

}
