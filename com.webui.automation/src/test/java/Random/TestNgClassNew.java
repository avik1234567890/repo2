package Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClassNew {
	


	@Test(enabled=false)
  public void f() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");  
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/default.aspx");
	driver.close();
	System.out.println("test done chrome");
	}
	@Test(enabled=false)
	public void g() {
		//C:\Users\achoudhury20\git\repo2\com.webui.automation\geckodriver-v0.28.0-win64\geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.close();
		System.out.println("test done FF");
	}
	

	
	
}
