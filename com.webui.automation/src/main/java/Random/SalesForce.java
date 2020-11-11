package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://login.salesforce.com/");
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.findElement(By.cssSelector("#username")).sendKeys("abc");
	d.findElement(By.cssSelector("#password")).sendKeys("abc");
	d.findElement(By.cssSelector("#Login")).click();
	System.out.println("I am here");
	System.out.println(d.findElement(By.cssSelector("div#error")).getText());

	}

}
