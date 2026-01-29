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
	
	@FindBy(xpath="//span[text()='School POS']")
	private WebElement schoolPOSbtn;
	
	@FindBy(xpath="(//button[text()='Stock Allotment'])[1]")
	private WebElement stockAllotmentBtn;
	
	@FindBy(xpath="(//button[text()='Returned Stock'])[1]")
	private WebElement returnedStock;
	
	@FindBy(xpath="(//button[text()='Pos Orders'])[1]")
	private WebElement posOrdersBtn;
	
	@FindBy(xpath="(//button[text()='Pos Sale'])[1]")
	private WebElement posSaleBtn;
	
	@FindBy(xpath="(//button[text()='Pos Exchange'])[1]")
	private WebElement posExchangeBtn;
	
	@FindBy(xpath="(//button[text()='Pos Return'])[1]")
	private WebElement posReturnBtn;
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
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
	
	public void openStockAllotment()
	{
		schoolPOSbtn.click();
		stockAllotmentBtn.click();
	}
	
	public void openReturnedStock()
	{
		schoolPOSbtn.click();
		returnedStock.click();
	}
	
	public void openPosOrders()
	{
		schoolPOSbtn.click();
		posOrdersBtn.click();
	}
	
	public void openPosSale()
	{
		schoolPOSbtn.click();
		posSaleBtn.click();
	}
	
	public void openPosExchange()
	{
		schoolPOSbtn.click();
		posExchangeBtn.click();
	}
	
	public void openPosReturn()
	{
		schoolPOSbtn.click();
		posReturnBtn.click();
		
	}
	
	
	
	

}
