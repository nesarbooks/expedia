package bookFlights;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import baseProperty.BaseClass;
import pageActions.FlightBookingPage;
import pageActions.LandingPage;
import pageActions.PassengerInfo;
import pageActions.SearchPage;
import pageActions.SelectFlightsPage;


public class Verify_FlightBooking_Functionality extends BaseClass{

	LandingPage lp;
	FlightBookingPage fbp;
	SearchPage sp;
	SelectFlightsPage sfp;
	PassengerInfo pi;
	
	@BeforeClass
	public void SetUpBrowser() throws IOException
	{
		Invoke();
	}

	@Test
	public void Validate_FlightBooking() throws InterruptedException
	{
		lp=new LandingPage(driver);
		Thread.sleep(1000);
		lp.Flights().click();
		Thread.sleep(1000);
		fbp=new FlightBookingPage(driver);
		fbp.Roundtrip().click();
		Thread.sleep(1000);
		fbp.Flyingfrom().click();
		fbp.Flyingfrom().sendKeys("IAD");
		Thread.sleep(1000);
		fbp.Flyingfrom().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
		Thread.sleep(1000);
		fbp.Flyingto().click();
		fbp.Flyingto().sendKeys("DXB");
		fbp.Flyingto().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
		Thread.sleep(1000);
		fbp.SelectDepartureDate().click();
		Thread.sleep(1000);
		fbp.DepartureDate().click();
		Thread.sleep(1000);
		fbp.SelectReturnDate().click();
		Thread.sleep(1000);
		fbp.ReturnDate().click();
		Thread.sleep(1000);
		fbp.SearchFlightsButton().click();
		Thread.sleep(5000);
		
		sfp=new SelectFlightsPage(driver);
		//sfp.HandleNewTab();
		Thread.sleep(8000);
		sfp.departure_flight().click();
		//sfp.ContinueBooking().click();
		Thread.sleep(1000);
		sfp.return_flight().click();
		Thread.sleep(3000);
		sp=new SearchPage(driver);
		//sp.Select().click();
		//Thread.sleep(1000);
		//sp.Select().click();
		sp.Select().click();
		Thread.sleep(3000);
		sp.HandleNewTab();
		Thread.sleep(8000);
		sp.conbooking().click();
		Thread.sleep(1000);
	/*	if(sp.pop()>0)
		{
			System.out.println(sp.pop());
			Thread.sleep(1000);
			sp.popup().click();
		}*/
		pi=new PassengerInfo(driver);
		pi.FirstName().sendKeys("Mike");
		Thread.sleep(1000);
		pi.MiddleName().sendKeys("J.");
		Thread.sleep(1000);
		pi.LastName().sendKeys("Marsack");
		Thread.sleep(1000);
		pi.Select_Country_Code();
		Thread.sleep(2000);
		pi.PhoneNumber().sendKeys("4054254241");
		Thread.sleep(1000);
		pi.CheckBox().click();
		Thread.sleep(1000);
		pi.Select_Passport().click();
		Thread.sleep(1000);
		pi.Select_Gender().click();
		Thread.sleep(1000);
		pi.Select_DOB_Month();
		Thread.sleep(1000);
		pi.Select_DOB_Day();
		Thread.sleep(1000);
		pi.Select_DOB_Year();
		Thread.sleep(3000);
		System.out.println("All code ran successfully --> Testing Passed");
	}

	
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Successfully committed the code to GitHub");
		//driver.quit();
	}



}

