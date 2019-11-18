package pageActions;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//a[@id='forcedChoiceNoThanks']")
	WebElement Select;
	
	@FindBy (xpath="//button[@id='bookButton']")
	WebElement continuebook;
	
	/*By pop=By.xpath("//a[@id='forcedChoiceNoThanks']");*/
	public WebElement Select()
	{
		return Select;
	}
	
	public WebElement conbooking()
	{
		return continuebook;
	}
	public void HandleNewTab()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator <String> ite = windowHandles.iterator();
		driver.switchTo().window(ite.next());
		driver.switchTo().window(ite.next());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	/*public WebElement popup()
	{
		return popup;
	}*/
}
