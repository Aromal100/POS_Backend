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
	
	@FindBy(xpath="//button[text()='Product Barcode Printing']")
	private WebElement productBarcodePrintingBtn;
	
	@FindBy(xpath="//span[text()='Stock Management']")
	private WebElement stockManagementBtn;
	
	@FindBy(xpath="(//button[text()='Stocks'])[1]")
	private WebElement stocksBtn;
	
	@FindBy(xpath="//button[text()='Rate Management']")
	private WebElement ratemanagementBtn;
	
	@FindBy(xpath="//span[text()='Settings']")
	private WebElement settingsBtn;
	
	@FindBy(xpath="//button[text()='Discount Coupon']")
	private WebElement discountCouponBtn;
	
	
	@FindBy(xpath="(//button[text()='Stock'])[1]")
	private WebElement stockbtn;
	
	@FindBy(xpath="(//button[text()='Stocks Allotment'])[1]")
	private WebElement stocksAllotmentbtn;
	
	
	
	
	
	
	
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
	
	public void openPrintBarcodePrinting()
	{
		productManagementBtn.click();
		productBarcodePrintingBtn.click();
		
	}
	
	public void openStocks()
	{
		stockManagementBtn.click();
		stocksBtn.click();
	}
	
	public void openRateManagement()
	{
		productManagementBtn.click();
		ratemanagementBtn.click();
	}
	
	public void openDiscountCoupon()
	{
		settingsBtn.click();
		discountCouponBtn.click();
		
	}
	
	public void openStock()
	{
		stockManagementBtn.click();
		stockbtn.click();
	}
	
	
	public void openStocksAllotment()
	{
		stockManagementBtn.click();
		stocksAllotmentbtn.click();
	}
	
	
	
	

}
