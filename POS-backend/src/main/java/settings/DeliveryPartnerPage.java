package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class DeliveryPartnerPage extends BasePage{

	waitHelper wait= new waitHelper(driver);
	
	public DeliveryPartnerPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search by Name']")
	private WebElement searchBox;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement viewDeliveryPartner;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(id="minimumkg")
	private WebElement miniKg;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updateBtn;
	
	@FindBy(xpath="//div[text()='Delivery partner updated successfully.']")
	private WebElement deliveryPartnerUpdatedMessage;
	

	
	public void checkSearch(String name)
	{
		searchBox.sendKeys(name);
	}
	
	public void checkViewPartner()
	{
		viewDeliveryPartner.click();
	}
	
	public void clickCancel()
	{
		cancelBtn.click();
	}
	
	public void enterMiniKg(String no)
	{
		miniKg.clear();
		miniKg.sendKeys(no);
		updateBtn.click();
	}
	
	public String getDeliveryPartnerUpdatedMessage()
	{
		wait.visibilityOf(deliveryPartnerUpdatedMessage, 5);
		return deliveryPartnerUpdatedMessage.getText();
	}
	
	

}
