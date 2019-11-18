package pageActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightsPage {

	WebDriver driver;
	public SelectFlightsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='flight-module-2019-11-25t22:05:00-05:00-coach-iad-fra-ua-932-coach-fra-dxb-ua-8904_2019-12-15t23:55:00+04:00-coach-dxb-yyz-ua-8073-coach-yyz-iad-ua-8266_']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement departure_Flight;
	@FindBy(xpath= "//li[@id='flight-module-2019-11-25t22:05:00-05:00-coach-iad-fra-ua-932-coach-fra-dxb-ua-8904_2019-12-15t23:55:00+04:00-coach-dxb-yyz-ua-8073-coach-yyz-iad-ua-8266_']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement return_Flight;
	
	
	
	
	/*public void HandleNewTab()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> Ite = windowHandles.iterator();
		driver.switchTo().window(Ite.next());
		driver.switchTo().window(Ite.next());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}*/
	
	public WebElement departure_flight()
	{
		return departure_Flight;
	}
	public WebElement return_flight()
	{
		return return_Flight;
	}
	
	
	
	
	
	
	
	
	
	
	
}
