package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePage extends BasePage{

	public SidePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Dashboards']")
	private WebElement dashboardBtn;
	
	@FindBy(xpath="//button[text()='School Store Dashboard']")
	private WebElement schoolStoreDashboardBtn;
	
	@FindBy(xpath="//span[text()='Product Management']")
	private WebElement productManagementBtn;
	
	@FindBy(xpath="//button[text()='Product Kit']")
	private WebElement productKitBtn;
	
	
	public void openSchoolStoreDashboard()
	{
		dashboardBtn.click();
	    schoolStoreDashboardBtn.click();	
	}
	
	public void openProductKit()
	{
		productManagementBtn.click();
		productKitBtn.click();
	}

}
