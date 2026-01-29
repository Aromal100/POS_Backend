package stockmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class StocksAllotment extends BasePage{

	waitHelper wait= new waitHelper(driver);
	
	public StocksAllotment(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search by GTN Number']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement selectUniformOption;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement actionBtn;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	private WebElement recievedQty;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//div[text()='Stock status updated successfully']")
	private WebElement stockStatusUpdatedMessage;

	
	public void selectFilterToUniform()
	{
		filterBtn.click();
		selectUniformOption.click();
	}
	
	public void checkSearch(String name)
	{
		searchBox.sendKeys(name);
	}
	
	public void addRecivedQty(String no)
	{
		actionBtn.click();
		recievedQty.clear();
		recievedQty.sendKeys(no);
		saveBtn.click();	
	}
	
	public String getStockStatusUpdatedMessage()
	{
		wait.visibilityOf(stockStatusUpdatedMessage, 5);
		return stockStatusUpdatedMessage.getText();
		
	}
		
	
	

}
