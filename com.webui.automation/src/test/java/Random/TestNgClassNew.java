package Random;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClassNew {
	


	@Test(enabled=false)
  public void f() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");  
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bankbazaar.com/personal-loan.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input[value='SALARIED']")).click();
	driver.findElement(By.cssSelector("//INPUT[@aria-activedescendant='react-select-3--value']/self::INPUT")).sendKeys("infosys");
	//driver.findElement(By.cssSelector("input[class='Select-input']")).sendKeys(Keys.ENTER);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//WebElement e=driver.findElement(By.cssSelector("div[class='select-menu-outer']"));
	//Actions a=new Actions(driver);
	//a.moveToElement(e).click().perform();
	//driver.findElement(By.cssSelector("input[class='Select-input']")).click();	
	}
	
	@Test(enabled=true)
public void BankBazar() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='SALARIED']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("0");
		driver.findElement(By.xpath("//input[@class='Select-input']")).sendKeys("INFOSYS");
		System.out.println("1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='Select-input']")).click();
		System.out.println("2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Select-input']//input[@aria-activedescendant='react-select-3-option-1']")).click();
		System.out.println("3");
	}
	
	
	@Test(enabled=true)
	public void g() {
	
		//ChromeOptions c=new ChromeOptions();
		//c.addArguments("--Headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions c=new ChromeOptions();
		//c.addArguments("headless");
		//c.addArguments("disable-gpu");
		//c.addArguments("window-size=1980,1080");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.uk/");
		System.out.println("Title of the page is -> " + driver.getTitle());
		driver.findElement(By.cssSelector("button[aria-label='Going to']")).click();
		driver.findElement(By.cssSelector("#location-field-destination")).sendKeys("DUS");
		List<WebElement> list=driver.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext"));
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		driver.close();
		//		WebElement ul=driver.findElement(By.cssSelector("ul[data-stid='location-field-destination-results']"));
//		List<WebElement> list=ul.findElements(By.tagName("li"));
//		System.out.print(list.size());
	}
	@Test(enabled=true)
	public void Zomato()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/chennai");
		
		//Finding the resto
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("A2B");
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).click();
		
		
		//Selecting the resto
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='sc-bfYoXt jQyIap']")).click();
		
		
		//Check the resto status and clicking order online
		/*
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//section[@class='sc-iCwjlJ kpAWXT']//span[@class='sc-fkyLDJ fenpeF']")));
		WebElement status=driver.findElement(By.xpath("//div[@id='root']//section[@class='sc-iCwjlJ kpAWXT']//span[@class='sc-fkyLDJ fenpeF']"));
		if(status.getText().equalsIgnoreCase("Open now"))
		{
			System.out.println("Resto status: "+status.getText());
		}
		else 
			System.out.println("Resto status: "+status.getText());
			
		*/	
		
		//Order online
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement orderonline=driver.findElement(By.xpath("//span[@id='TabLink__1']"));
		js.executeScript("arguments[0].scrollIntoView();",orderonline);
		js.executeScript("arguments[0].click();", orderonline);
		
		
		
		
		/*
		
		Actions a=new Actions(driver);
		a.moveToElement(orderonline).click().perform();
		*/
		
		
		
		//Find the total number of must  try items
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> musttry=driver.findElements(By.xpath("//div[@id='root']//div[@class='sc-1s0saks-2 iUcvwY']//div[contains(text(),'MUST TRY')]"));
		System.out.println("Total must try is: "+musttry.size());
 	
		//Costliest sweet from the list
		
	WebElement sweets=driver.findElement(By.cssSelector("section.sc-haEqAx.iUgSzH > p.sc-1hez2tp-0.sc-tVThF.draRas:nth-child(7)"));
	js.executeAsyncScript("arguments[0].click();", sweets);
	
		
		
	}
	
@Test(enabled=true)
public void k()
{
	String p="abc";
	String s="bcaabccbambacj";
	int p_ascii=TestNgClassNew.counascii(p);
	int begin=0;
	int end=p.length();
	int i=0;
	try {		
	
	while(end<=s.length())
	{
		i=TestNgClassNew.counascii(s.substring(begin, end));
		//System.out.println(p_ascii+"<->"+i+s.substring(begin, end)+begin+end);
		if(i==p_ascii)
		{
			System.out.println("Index is: "+begin);
		}
		
		begin++;
		end++;
	}
	}
	catch(Exception e)
	{
		System.out.print("I am done");
	}
	
	
	
}
public static int counascii(String s)
{
	int total=0;
	char character;
	for(int i=0;i<s.length();i++)
	{
		character=s.charAt(i);
		total+=(int)character;
	}
	return total;
}
	@Test
	public void Olacab()
	{
		//WebDriverSetup
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("window-size=1980,1080");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://www.olacabs.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//select outstation
		driver.findElement(By.xpath("//div[@class='tab-btn-wrapper text-center']//a[contains(text(),'Outstation')]")).click();
	
		//Frame switch
		driver.switchTo().frame(0);

		//Open and choose pickup 
		driver.findElement(By.xpath("//div[@class='row-sm ptr']//div[@class='middle h-full text value']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement pickup=driver.findElement(By.xpath("//div[@class='row-sm ptr']//div[@class='middle h-full text value']"));
		Actions a=new Actions(driver);
		a.moveToElement(pickup).click().perform();
		WebElement source=driver.findElement(By.xpath("//input[@id='addressInput']"));
		wait.until(ExpectedConditions.visibilityOf(source));
		driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("CHENNAI ONE ");
		driver.findElement(By.xpath("//div[@class='row results ola-ripple ptr'][1]")).click();
		
		//Open and choose drop 
		WebElement drop=driver.findElement(By.xpath("//div[@class='middle h-full text placeholder']"));
		wait.until(ExpectedConditions.visibilityOf(drop));
		drop.click();
		//a.moveToElement(drop).click().perform();
		WebElement destination=driver.findElement(By.xpath("//input[@id='addressInput']"));
		wait.until(ExpectedConditions.visibilityOf(destination));
		destination.sendKeys("BANGALORE");
		destination.sendKeys(destination.getText()+" ");
		
		driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys(Keys.ENTER);
		WebElement destinationcity=driver.findElement(By.xpath("//div[@class='row results ola-ripple ptr'][1]"));
		wait.until(ExpectedConditions.visibilityOf(destinationcity));
		destinationcity.click();
		
		//Search outstation cab
		WebElement search=driver.findElement(By.xpath("//button[@class='ow-button ow-button--secondary']"));
		wait.until(ExpectedConditions.visibilityOf(search));
		//js.executeScript("arguments[0].click()", search);		
		//search.click();
		a.moveToElement(search).click().perform();
	
	}
	@Test
	public void TheJewelleryroom() {
	
		//Set up
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://thejewelleryroom.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,50);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Actions a=new Actions(driver);
				
		//Select Bagles
		
		WebElement bangles=driver.findElement(By.xpath("//div[@class='category-information has-text-centered']//div[@class='category-name' and contains(text(),\"Bangles\")]"));
		wait.until(ExpectedConditions.visibilityOf(bangles));
		//System.out.print("TEST");
		bangles.click();
		
		//Dropdown at the secong page
		
		
		WebElement dropdown=driver.findElement(By.xpath("//span[normalize-space()='Popular']"));
		//WebElement dropdown=driver.findElement(By.xpath("span[@class='order-by-wrapper']//div[@class='dropdown']//div[@class='dropdown-trigger']//button[@class='button']//span[@class='icon is-small']"));
		
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		dropdown.click();
		
		//Sorting high to low price
		WebElement pricefilter=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[@class='dropdown-item' and contains(text(),\"Price (high-low)\")]"));
		wait.until(ExpectedConditions.visibilityOf(pricefilter));
		pricefilter.click();
		
		//List of bangles
		/*
		List<WebElement> selectedbangles=driver.findElements(By.xpath("//div[@class='product-designer']"));
		
		for(WebElement w:selectedbangles)
		{
			
			System.out.println(w.getText());
			
		}
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='currency-dkk']"));
		for(WebElement w:price)
		{
			
			System.out.println(w.getText());
			
		}
		*/
		//Choosing the first item
		WebElement firstitem=driver.findElement(By.cssSelector("div.product-image.reload-lazy.lazyloaded:nth-child(1)"));
		wait.until(ExpectedConditions.visibilityOf(firstitem));
		firstitem.click();
		
		//Download the image

		//Capture price english
		String price_en=driver.findElement(By.xpath("//div[@class='product-price']//span[@class='currency-wrapper has-currency-switcher']//span[@class='price currency-dkk']")).getText();
		System.out.println("English price "+price_en);
		
		//Click on the danish flag
		WebElement flag=driver.findElement(By.xpath("//div[@class='language-switcher flags-only']//div//a[2]"));
		wait.until(ExpectedConditions.visibilityOf(flag));
		js.executeScript("arguments[0].click()", flag);
		

		//Capture price danish
		driver.switchTo().defaultContent();
		String price_dn=driver.findElement(By.xpath("//div[@class='product-price']//span[@class='currency-wrapper has-currency-switcher']//span[@class='price currency-dkk']")).getText();
		if(price_en.equalsIgnoreCase(price_dn))
			System.out.println("Price matched");
		else
			System.out.println("Price did not matched");
		
	}

	@Test
	public void Google() {
		
		//Set up
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\geckodriver-v0.28.0-win64\\geckodriver.exe");		
	    //WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		WebDriverWait wait= new WebDriverWait(driver,50);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Actions a=new Actions(driver);
		
		//Open Google and search 
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		searchbox.sendKeys("cyclone nivar");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement choice=driver.findElement(By.xpath("//ul[@class='erkvQe' and @jsname='erkvQe' and @role='listbox']//li[3]"));
		wait.until(ExpectedConditions.visibilityOf(choice));
		js.executeScript("arguments[0].click()", choice);
		
		//Choosing the zoom result
		WebElement result_zoom=driver.findElement(By.xpath("//span[normalize-space()='Cyclone Nivar LIVE Images and Tracker | Zoom Earth']"));
		wait.until(ExpectedConditions.visibilityOf(result_zoom));
		result_zoom.click();
		
		//Fetching the values
		WebElement windtype=driver.findElement(By.xpath("//tr[@class='rank1 selected']//td[@class='type']//span"));
		wait.until(ExpectedConditions.visibilityOf(windtype));
		System.out.println("Wind type "+windtype.getText());
		WebElement wind=driver.findElement(By.xpath("//tr[@class='rank1 selected']//td[@class='wind']"));
		wait.until(ExpectedConditions.visibilityOf(wind));
		System.out.println("Wind "+wind.getText());
		WebElement pressure=driver.findElement(By.xpath("//tr[@class='rank1 selected']//td[@class='pressure']"));
		wait.until(ExpectedConditions.visibilityOf(pressure));
		System.out.println("Pressure "+pressure.getText());
		//Forecast time hits land
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement forcast_time=driver.findElement(By.xpath("//tr[@class='rank1 forecast']//td[@class='time']"));
		WebElement forcast_date=driver.findElement(By.xpath("//tr[@class='rank1 forecast']//td[@class='date']"));
		WebElement forcast_windspeed=driver.findElement(By.xpath("//tr[@class='rank1 forecast']//td[@class='wind']"));
		wait.until(ExpectedConditions.visibilityOf(forcast_date));
		System.out.println("forcast date "+forcast_date.getText());
		wait.until(ExpectedConditions.visibilityOf(forcast_time));
		System.out.println("forcast time "+forcast_time.getText());
		wait.until(ExpectedConditions.visibilityOf(forcast_windspeed));
		System.out.println("forcast windspeed "+forcast_windspeed.getText());
	}


}
