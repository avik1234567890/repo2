package Random;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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
@Test
public void Palindromecheck() {
	String input ="nnaxnonjmomypptpypy";
	String rev=null;
	String sub=null;
	int l=input.length();
	//nn non mom pp ptp pyp ypy
	//nnaxnonjmomypptpypy
	

	for(int i=0;i<input.length();i++)
		{
			for(int j=i+2;j<input.length();j++)
			{
				sub=input.substring(i,j);
			
				rev=String.valueOf(TestNgClassNew.checkPalindrome(sub));
				
				if(sub.equalsIgnoreCase(rev))
				{				
					System.out.println(rev);				
				}	 
			}
		}
	

	}
		

public static char[] checkPalindrome(String g) {
	char[] rev = g.toCharArray();
	int j=0;
	for(int i=g.length()-1;i>=0;i--)
	{
		rev[j]=g.charAt(i);
		j++;
	}

	return rev;
}

@Test
public void LenseKart() {
	//Set up
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Actions a=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.lenskart.com");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver, 50);
	
	//Push notification
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement nothanks=driver.findElement(By.xpath("//button[normalize-space()='No thanks']"));
	wait.until(ExpectedConditions.visibilityOf(nothanks));
	js.executeScript("arguments[0].click()", nothanks);
	
	//Mouse hover and select computer glass
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement computerGlass=driver.findElement(By.xpath("//a[contains(text(),'Computer Glasses')]"));
	wait.until(ExpectedConditions.visibilityOf(computerGlass));
	a.moveToElement(computerGlass).perform();
	
	WebElement menSection=driver.findElement(By.xpath("(//SPAN[@class='uppercase'][text()='men'][text()='men'])[2]"));
	wait.until(ExpectedConditions.visibilityOf(menSection));
	a.moveToElement(menSection).perform();
	
	WebElement premiumRange=driver.findElement(By.xpath("(//SPAN[@class='fw700'][text()='PREMIUM RANGE'][text()='PREMIUM RANGE'])[1]"));
	wait.until(ExpectedConditions.visibilityOf(premiumRange));
	premiumRange.click();
	
	//Select frame shape
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	WebElement frameShape=driver.findElement(By.xpath("//span[@title='Round']"));
	wait.until(ExpectedConditions.visibilityOf(frameShape));
	frameShape.click();
	
	//Choose color with highest number
	driver.navigate().refresh();
	
	List<WebElement> color=driver.findElements(By.xpath("//li[@class='list-checkbox']//div[@class='listItem']//label//span"));
	String[] colorCount;
	Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
	Matcher m; 
	for(WebElement e:color) {

			m=p.matcher(e.getText());
			System.out.println(m.group(0));
	      	
	
	}
}

@Test
public void letterOccurance() {
	String s="Amazon is a good company, here you can find guuud stuffs";
	int ascii1=0;
	int ascii2=0;
    int count=1;
	char output;
	HashMap<Character,Integer> details=new HashMap<Character,Integer>();
	for(int i=0;i<s.length()-1;i++)
	{
		ascii1=s.charAt(i);
		output=s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{
			ascii2=s.charAt(j);
			if(ascii1==ascii2)
			{
				
				//count++;
				details.put(output, count++);
			}
			else 
				break;
			
		}
		for(Map.Entry h : details.entrySet()) {
			System.out.println(h.getKey()+" : "+h.getValue());
		}
		
	}
	
}


@Test
public void ServiceNow() throws InterruptedException {
	
	//Set up
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Actions a=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,50);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("https://dev96572.service-now.com/");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//Login
	driver.switchTo().frame("gsft_main");
	WebElement userName=driver.findElement(By.xpath("//input[@id='user_name']"));
	wait.until(ExpectedConditions.visibilityOf(userName));
	userName.sendKeys("admin");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='user_password']"));
	wait.until(ExpectedConditions.visibilityOf(password));
	password.sendKeys("Tuna@123");
	
	WebElement loginButton=driver.findElement(By.xpath("//button[@id='sysverb_login']"));
	wait.until(ExpectedConditions.visibilityOf(loginButton));
	loginButton.click();
	
	//Switching to default content
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.switchTo().defaultContent();
	
	//tryping in the filter Oauth
	WebElement filter=driver.findElement(By.xpath("//input[@id='filter']"));
	wait.until(ExpectedConditions.visibilityOf(filter));
	filter.sendKeys("Oauth");
	
	//Selecting application registry
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement applicationReg=driver.findElement(By.xpath("//div[@class='sn-widget-list-title' and contains(text(),'Application Registry')]"));
	wait.until(ExpectedConditions.visibilityOf(applicationReg));
	a.moveToElement(applicationReg).click().perform();
	
	//Creating new application registry
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame("gsft_main");
	WebElement newRegistry=driver.findElement(By.xpath("//div[@class='navbar-header']//button[@id='sysverb_new']"));
	wait.until(ExpectedConditions.elementToBeClickable(newRegistry));
	newRegistry.click();
	
	//Clicking on the create API end point link
	WebElement linkCreateAPI=driver.findElement(By.xpath("//a[contains(text(),'Create an OAuth API endpoint for external clients')]"));
	wait.until(ExpectedConditions.visibilityOf(linkCreateAPI));
	a.moveToElement(linkCreateAPI).click().perform();
	
	//Fill the API end point form
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement name=driver.findElement(By.xpath("//input[@id='oauth_entity.name']"));
	wait.until(ExpectedConditions.visibilityOf(name));
    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
    Date date = new Date(); 
    String nameValue="Zuudass"+formatter.format(date);
    name.sendKeys(nameValue);
    WebElement submitButton=driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']"));
    wait.until(ExpectedConditions.elementToBeClickable(submitButton));
    submitButton.click();
    
    //Verify the creation of the API end point
    
   
    //driver.navigate().refresh();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement nextButton=driver.findElement(By.xpath("//div[@class='nav navbar-right text-align-right']//span//button[@class='list_nav  btn btn-icon h_flip_content' and @name='vcr_next']"));
    List<WebElement> clientName = null;
    
    while(nextButton.isEnabled()) {
    	Thread.sleep(2000);
    	clientName=driver.findElements(By.xpath("//tbody[@class='list2_body']//td[3]//a"));
    	for(WebElement e:clientName) {
    		
    		if(nameValue.equalsIgnoreCase(e.getText()))
    		{
    			System.out.println("MATCHED");
    			break;
    		}
    		
    		}
    	nextButton.click();
    	
    }
    
    
    
    
}

@Test(enabled=true)
public void MakeMyTrip() {
	//Set up
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Actions a=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,50);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

	//click on flight option
	
	WebElement flights=driver.findElement(By.xpath("//li[@class='menu_Flights']//a//span[2]"));
	wait.until(ExpectedConditions.visibilityOf(flights));
	a.moveToElement(flights).click().perform();
	
	//Select oneway journey
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement oneWay=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip' and contains(text(),'OneWay')]"));
	wait.until(ExpectedConditions.elementToBeClickable(oneWay));
	a.moveToElement(oneWay).click().perform();
	
	//Selecting from and and city
	WebElement fromCity=driver.findElement(By.xpath("//input[@id='fromCity']"));
	wait.until(ExpectedConditions.elementToBeClickable(fromCity));
	fromCity.click();
	WebElement fromCityName=driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li[2]"));
	wait.until(ExpectedConditions.elementToBeClickable(fromCityName));
	a.moveToElement(fromCityName).click().perform();
	
	//Selecting to and and city
	WebElement toCityName=driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li[1]"));	
	wait.until(ExpectedConditions.elementToBeClickable(toCityName));
	js.executeScript("arguments[0].click()", toCityName);
	
	//Selecting the next monday
	WebElement selectedDate=driver.findElement(By.cssSelector("div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div.DayPicker-Week > div[aria-selected=\"true\"]"));
	List<WebElement> week=driver.findElements(By.cssSelector("div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div.DayPicker-Week"));
	for(int i=1;i<week.size();i++) {
		
		WebElement e=driver.findElement(By.cssSelector("div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div:nth-child("+i+") > div[aria-selected=\"true\"]"));
			if(e.isDisplayed()) {
				i++;
				driver.findElement(By.cssSelector("div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div:nth-child("+i+") > div:nth-child(2)")).click();
				break;
			}
			
		
	}
	
	//Clicking on search button
	WebElement searchButton=driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
	wait.until(ExpectedConditions.elementToBeClickable(searchButton));
	searchButton.click();
	
	//Wait for the search reasult
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Sort the the price in decending order
	WebElement price=driver.findElement(By.xpath("//span[contains(text(),'Price')]"));
	wait.until(ExpectedConditions.elementToBeClickable(price));
	price.click();
	
	//fetch second highest priced flight numbers

	
	try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement flightNumbers=driver.findElement(By.cssSelector("div#premEcon > div > div:nth-child(4) > div > div > div.fli-list-body-section > div.dept-options > div.dept-options-section.clearfix > div.pull-left.airline-info > div:nth-child(2) > p:nth-child(2)"));
		wait.until(ExpectedConditions.visibilityOf(flightNumbers));
			String[] array=flightNumbers.getText().split("[\\s|]+");
			System.out.println(Arrays.toString(array));
	
	}
	catch(StaleElementReferenceException e) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement flightNumbers=driver.findElement(By.cssSelector("div#premEcon > div > div:nth-child(4) > div > div > div.fli-list-body-section > div.dept-options > div.dept-options-section.clearfix > div.pull-left.airline-info > div:nth-child(2) > p:nth-child(2)"));
		wait.until(ExpectedConditions.visibilityOf(flightNumbers));
			String[] array=flightNumbers.getText().split("[\\s|]+");
			System.out.println(Arrays.toString(array));
		
	}
	
}

@Test(enabled=true)
public void RedBus() {
	
	//Setup
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Actions a=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,50);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.com/");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//Selecting to and from
	WebElement to=driver.findElement(By.xpath("//input[@id='dest']"));
	wait.until(ExpectedConditions.elementToBeClickable(to));
	to.sendKeys("Bangalore");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement toCity=driver.findElement(By.xpath("//li[@data-id='122']"));
	a.moveToElement(toCity).click().perform();
	String keyStroke=Keys.chord(Keys.SHIFT,Keys.TAB);
	to.sendKeys(keyStroke);
	WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
	wait.until(ExpectedConditions.elementToBeClickable(from));
	from.sendKeys("Chennai");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement fromCity=driver.findElement(By.xpath("//LI[@data-id='123']"));
	wait.until(ExpectedConditions.elementToBeClickable(fromCity));
	a.moveToElement(fromCity).click().perform();
	
	//Selecting the month
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement calendar=driver.findElement(By.xpath("//input[@id='onward_cal']"));
	wait.until(ExpectedConditions.elementToBeClickable(calendar));
	a.moveToElement(calendar).click().build().perform();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//selecting Next month
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement nextMonth=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//tbody//tr[@class='rb-monthHeader']//td[@class='next']//button[contains(text(),'>')]")); ////td[@class='next']//button
	wait.until(ExpectedConditions.visibilityOf(nextMonth));
	a.moveToElement(nextMonth).click().build().perform();

	String month="Apr 2021";

	//Select the monday
	List<WebElement> weeks=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//tbody//tr"));
	try {
	
		
			for(int i=3;i<weeks.size();i++){
			
					WebElement monday=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//tbody//tr["+i+"]//td[1]"));
						while(true) {
								if(monday.getText()!=null)
										{
											monday.click();
											System.out.println(i);
											break;
										}
									}
											}
												
		
				
	}
	catch(ElementNotInteractableException e){
		System.out.println("Handled ;) ");
	}

	
	//Clicking on the search button
	WebElement searchButton=driver.findElement(By.xpath("//button[@id='search_btn']"));
	wait.until(ExpectedConditions.visibilityOf(searchButton));
	searchButton.click();
	
	//Fetching the total number of found buses
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement buses=driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
	String busCount=buses.getText();
	String[] bus=busCount.split("\\s+");
	System.out.println("The total bus found for you is: "+bus[0]);
	
}

@Test(enabled=true)
public void myntra() throws InterruptedException {
	//set up
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,50);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Actions a=new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.myntra.com/");
	
	//Search sunglasses
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	WebElement searchBox=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	wait.until(ExpectedConditions.elementToBeClickable(searchBox));
	searchBox.sendKeys("Sunglasses");
	searchBox.sendKeys(Keys.ENTER);
	
	//click on magnifying glass
	WebElement brand=driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']//div[@class='filter-search-filterSearchBox']//span[@class='myntraweb-sprite filter-search-iconSearch sprites-search']"));
	wait.until(ExpectedConditions.elementToBeClickable(brand));
	brand.click();
	
	//search for polaroid
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	WebElement searchBrand=driver.findElement(By.xpath("//div[@class='filter-search-filterSearchBox filter-search-expanded']//input"));
	wait.until(ExpectedConditions.elementToBeClickable(searchBrand));
	searchBrand.sendKeys("polaroid");
	
	//Select polaroid check box
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement checkBox=driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']//div[@class='common-checkboxIndicator']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkBox));
	js.executeScript("arguments[0].click()", checkBox);
	
	//click on +3 more menu
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement more=driver.findElement(By.xpath("//div[@class='atsa-more']"));
	wait.until(ExpectedConditions.elementToBeClickable(more));
	a.moveToElement(more).click().build().perform();
	
	//click on type
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement type=driver.findElement(By.cssSelector("ul.atsa-filters > li:nth-child(9)"));
	wait.until(ExpectedConditions.elementToBeClickable(type));
	a.moveToElement(type).click().build().perform();
	
	//selecting rectangular sunglasses from the type filter
	WebElement rectangularGlasses=driver.findElement(By.cssSelector("ul.atsa-values > li:nth-child(7)"));
	wait.until(ExpectedConditions.visibilityOf(rectangularGlasses));
	a.moveToElement(rectangularGlasses).click().build().perform();
	
	//select men rectangle sunglass and print the size
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String sunglassType="Men Rectangle Sunglasses";
	int i=1;
	List<WebElement> productList=driver.findElements(By.xpath("//ul[@class='results-base']//li[@class='product-base']//a//div[@class='product-productMetaInfo']//h4["+i+"]"));
	
	while(true) {
try {
		for(WebElement e:productList) {	
		i=1;		
			
		if(e.getText().equals(sunglassType)) {
			i++;
			a.moveToElement(e).build().perform();
			Thread.sleep(1000);
			System.out.println("Size ->"+driver.findElement(By.xpath("//ul[@class='results-base']//li[@class='product-base']//a//div[@class='product-productMetaInfo']//h4["+i+"]//span")).getText());
			
			}		
	}
		break;
}
catch(StaleElementReferenceException e1) {
	productList=driver.findElements(By.xpath("//ul[@class='results-base']//li[@class='product-base']//a//div[@class='product-productMetaInfo']//h4["+i+"]"));
	System.out.println("Expection");
	
}
	}
	
	//Similar items
	WebElement firstRecGlass=driver.findElement(By.xpath("//ul[@class='results-base']//li[1]"));
	WebElement similarItemMenu=driver.findElement(By.xpath("//ul[@class='results-base']//li[1]//div[@class='image-grid-similarColorsCta product-similarItemCta']"));
	a.moveToElement(firstRecGlass).build().perform();
	similarItemMenu.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	List<WebElement> similarItems=driver.findElements(By.xpath("//ul[@class='results-base results-similarGrid']//li[@class='product-base']"));
	System.out.println("Total similar Items are"+similarItems.size());
}

}






