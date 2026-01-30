package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;

public class CustomerSupportPage extends BasePage{

	public CustomerSupportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search customers']")
	private WebElement searchCustomerBox;
	
	@FindBy(xpath="//button[contains(@class,'group flex w-full cursor-pointer')]")
	private WebElement customer;
	
	@FindBy(xpath="//textarea[@placeholder='Type your reply…']")
	private WebElement textChat;
	
	@FindBy(xpath="//button[contains(@class,'inline-flex items-center')]")
	private WebElement sendBtn;
	
	public void checkSearchCustomer(String name)
	{
		searchCustomerBox.sendKeys(name);	
	}
	
	public void chatCustomer(String chat)
	{
		customer.click();
		textChat.sendKeys(chat);
		sendBtn.click();
	}
	
	
	

}
