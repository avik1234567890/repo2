package Random;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> element=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Is selected ?"+driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
		System.out.println("Now selected ?"+driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		System.out.println("Total checkboxes "+element.size());

	}

}
