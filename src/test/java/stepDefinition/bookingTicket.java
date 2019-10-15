package stepDefinition;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRespostory.home_page;


public class bookingTicket extends home_page {
	
	@Given("^User Launch the browser and CheapAir portal$")
	public void user_Launch_the_browser_and_CheapAir_portal() throws Throwable {
		browserLaunch();
		loadUrl("https://www.cheapair.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^User Choose the mode of travel$")
	public void user_Choose_the_mode_of_travel() throws Throwable {
		bookingTicket b = new bookingTicket();
	    home_page c = new home_page();
     c.functionClick(b.getOneway());
     }

	@When("^User enter the Source, Destination, date and passenger details$")
	public void user_enter_the_Source_Destination_date_and_passenger_details() throws Throwable {
		bookingTicket b = new bookingTicket();
	    home_page c = new home_page();
		Robot r = new Robot();
	     c.functionClick(b.getFrom());
	     c.typeData(b.getFrom(), "Chennai");
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     c.functionClick(b.getTO());
	     c.typeData(b.getTO(), "Coimbatore");
			Thread.sleep(3000);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     c.functionClick(b.getSelectDate());
	     WebDriverWait wait = new WebDriverWait(driver, 10);
	     WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"datePickerContainer\"]/div/div[1]/table/tbody/tr[1]/td[6]/a")));
	     c.functionClick(b.getSelectDay());
			Thread.sleep(2000);
	     c.functionClick(b.getChild());
	     c.functionClick(b.getSearchbtn());
	     
	     }

	@Then("^User enter the search flights button$")
	public void user_enter_the_search_flights_button() throws Throwable {
	   
	}



}
