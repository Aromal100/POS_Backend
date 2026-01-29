package stockmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class StockPage extends BasePage{
	
	waitHelper wait= new waitHelper(driver);

	public StockPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchBox;
	
	@FindBy(xpath="//button//span[text()='Actions']")
	private WebElement actionBtn;
	
	@FindBy(xpath="//button[text()='Status Change']")
	private WebElement statusChangeBtn;
	
	@FindBy(xpath="//button[@aria-label='Select all rows']")
	private WebElement selectAllBtn;
	
	@FindBy(xpath="//button[text()='Online']")
	private WebElement onlineBtn;
	
	@FindBy(xpath="//button[text()='Offline']")
	private WebElement offlineBtn;
	
	@FindBy(xpath="//div[text()='Status changed to offline for 10 item(s).']")
	private WebElement offlineStatusChangeMessage;
	
	@FindBy(xpath="//div[text()='Status changed to online for 10 item(s).']")
	private WebElement onlineStatusChangeMessage;
	

	
	public void checkSearch(String name)
	{
		searchBox.sendKeys(name);
	}
	
	public void changeStatusToOffline()
	{
		selectAllBtn.click();
		actionBtn.click();
		statusChangeBtn.click();
		offlineBtn.click();
		
	}
	
	public void changeStatusToOnline()
	{
		selectAllBtn.click();
		actionBtn.click();
		statusChangeBtn.click();
		onlineBtn.click();
		
	}
	
	public String getOfflineStatusChangeMessage()
	{
		wait.visibilityOf(offlineStatusChangeMessage, 5);
		return offlineStatusChangeMessage.getText();
		
	}
	
	public String getOnlineStatusChangeMessage()
	{
		wait.visibilityOf(onlineStatusChangeMessage, 5);
		return onlineStatusChangeMessage.getText();
		
	}
	

}
