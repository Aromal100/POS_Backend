package projectmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class RateManagementPage extends BasePage{
	
	waitHelper wait= new waitHelper(driver);

	public RateManagementPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//input[@placeholder='Enter New Rate'])[1]")
	private WebElement enterNewRate;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@placeholder='Search by Product Name or Category']")
	private WebElement searchBar;
	
	
	@FindBy(xpath="//div[text()='Product rates updated successfully.']")
	private WebElement productRateUpdatedMessage;
	
	public void enterRate(String name)
	{
		enterNewRate.sendKeys(name);
	}
	
	public void clickSave()
	{
		saveBtn.click();
	}
	
	public void searchBar(String name)
	{
		searchBar.sendKeys(name);
	}
	
	public String getProductRateUpdatedMessage()
	{
		wait.visibilityOf(productRateUpdatedMessage, 5);
		return productRateUpdatedMessage.getText();
		
	}
	

}
