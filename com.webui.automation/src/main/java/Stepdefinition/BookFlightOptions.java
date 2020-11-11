package Stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightOptions {

	WebDriver driver2=Searchflightstepdefinition.ReturnDriver();
	
	@Given("^List of flights are displayed$")
	public void List_of_flights_are_displayed()
	{
		System.out.println("Fligt list is displaying");
	}
	@And("^Flights are choosen and book option is clicked$")
	public void Flights_are_choosen_and_book_option_is_clicked()
	{
		
	}
	@When("^User select flexifly and baggage insurance is opted$")
	public void User_select_flexifly_and_baggage_insurance_is_opted()
	{
		
	}
	@Then("^verify the choosen flight details and total price payable$")
	public void verify_the_choosen_flight_details_and_total_price_payable()
	{
		
	}
	
}
