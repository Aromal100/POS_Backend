package schoolPOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;

public class PosOrders extends BasePage{

	public PosOrders(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//input[@placeholder='Search...'])[2]")
	private WebElement searchOrderId;
	
	@FindBy(xpath="//button[@aria-label='View Order']")
	private WebElement viewBtn;
	
	public void checkSearch(String name)
	{
		searchOrderId.sendKeys(name);
	}
	
	public void viewOrderId()
	{
		viewBtn.click();
	}
	

}
