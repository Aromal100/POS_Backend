package schoolPOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class StockAllotmentPage extends BasePage{
	
	waitHelper wait= new waitHelper(driver);

	public StockAllotmentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterOption;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement selectDubaiSchool;
	
	@FindBy(xpath="//button[text()='Transfer Stock']")
	private WebElement transferStockBtn;
	
	@FindBy(xpath="//option[text()='New Indian Model School, Dubai']")
	private WebElement selectDubaiInstitution;
	
	@FindBy(xpath="//option[text()='Uniform']")
	private WebElement selectUniformCategory;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Remarks']")
	private WebElement txtRemark;
	
	
	@FindBy(xpath="//input[@placeholder='Search with Product Name or Barcode']")
	private WebElement productsOption;
	
	@FindBy(xpath="(//button[@title='Add'])[1]")
	private WebElement product;
	
	
	
	@FindBy(xpath="//input[@placeholder='Enter Quantity']")
	private WebElement productEnterQTY;
	
	@FindBy(xpath="//button[text()='SEND']")
	private WebElement sendBtn;
	
	@FindBy(xpath="//div[text()='Stock allotment saved successfully']")
	private WebElement stockSavedMessage;
	
	
	@FindBy(xpath="//input[@placeholder='Search by GTN Number']")
	private WebElement searchBar;
	
	@FindBy(xpath="(//div[@class='flex items-center justify-start '])[12]")
	private WebElement newGtnNo;
	
	@FindBy(xpath="(//button[@id='radix-:r1v:'])[1]")
	private WebElement changeStatusBtn;
	
	@FindBy(xpath="//div[text()='Approve']")
	private WebElement approveBtn;
	
	@FindBy(xpath="//div[text()='Reject']")
	private WebElement rejectBtn;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement editBtn;
	
	@FindBy(xpath="(//button[@class='text-[#454661] cursor-pointer'])[1]")
	private WebElement previewBtn;
	
	@FindBy(xpath="//button[text()='Close']")
	private WebElement closeBtn;
	
	
	@FindBy(xpath="(//button[@class='p-1 hover:bg-gray-100 rounded cursor-pointer'])[1]")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//div[text()='Stock allotment deleted successfully']")
	private WebElement stockAllotmentDeletedMessage;
	
	@FindBy(xpath="//div[text()='Stock details updated successfully']")
	private WebElement stockUpdatedMessage;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement clickOk;
	
	

	
	


	

	
	public void addTransferStock(String name,String no)
	{
		transferStockBtn.click();
		selectDubaiInstitution.click();
		selectUniformCategory.click();
		txtRemark.sendKeys(name);
		productsOption.click();
		product.click();
		productEnterQTY.clear();
		productEnterQTY.sendKeys(no);
		sendBtn.click();
	}
	
	public String getStockSavedMessage()
	{
		wait.visibilityOf(stockSavedMessage, 5);
		return stockSavedMessage.getText();	
	}
	
	public String getNewGtnNo()
	{
		return newGtnNo.getText();
		
	}
	
	
	public void checkSearch(String name)
	{
		searchBar.sendKeys(name);
	}
	
	public void editTransferStock(String name,String no)
	{
		editBtn.click();
		wait.elementToBeClickable(txtRemark, 5);
		txtRemark.sendKeys(name);
		sendBtn.click();
		
	}
	
	public void viewPreview()
	{
		previewBtn.click();
		closeBtn.click();
	}
	
	public void deleteTransferStock()
	{
		deleteBtn.click();
		clickOk.click();
	}
	
	public String getStockAllotmentDeletedMessage()
	{
		wait.visibilityOf(stockAllotmentDeletedMessage, 5);
		return stockAllotmentDeletedMessage.getText();	
	}
	
	public String getStockUpdatedMessage()
	{
		wait.visibilityOf(stockUpdatedMessage, 5);
		return stockUpdatedMessage.getText();	
	}
	
	
	
	

}
