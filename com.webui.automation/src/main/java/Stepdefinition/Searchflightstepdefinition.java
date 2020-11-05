package Stepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchflightstepdefinition {
	WebDriver driver;
	//WebDriverWait wait=new WebDriverWait(driver,20);
	
	@Given("^user is on the search page$")
	public void user_is_on_the_search_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\achoudhury20\\git\\repo2\\com.webui.automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().deleteAllCookies(); 
		driver.get("https://www.cleartrip.com/");
	   	driver.manage().window().maximize();
		
		
	}
	@When("^enters the search details and click on search button$")
	public void enters_the_search_details_and_click_on_search_button()
	{
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("BOM");
		driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("CCU");
		driver.findElement(By.cssSelector("input[etitle='Depart Date']")).sendKeys("Fri, 04 Nov, 2020");
		driver.findElement(By.cssSelector("input[etitle='Return Date']")).clear();
		driver.findElement(By.cssSelector("input[etitle='Return Date']")).sendKeys("Wed, 13 Jan, 2021");
		Select adults=new Select(driver.findElement(By.cssSelector("select[name='adults']")));
		adults.selectByVisibleText("2");
		driver.findElement(By.cssSelector("input#creditShell")).click();
		driver.findElement(By.cssSelector("input#SearchBtn")).click();
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("alert('Test done');");
	}
	@Then("^list of available flight must be displayed$")
	public void list_of_available_flight_must_be_displayed()
	{
		System.out.println("test done");
		//driver.close();
	}
	
}
