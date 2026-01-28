package projectmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;
import utilities.waitHelper;

public class ProductKitPage extends  BasePage{

	waitHelper wait= new waitHelper(driver);
	
	public ProductKitPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Add Kit']")
	private WebElement addkitBtn;
	
	@FindBy(id="kitname")
	private WebElement kitname;
	
	@FindBy(xpath="(//button[@role='combobox'])[1]")
	private WebElement catagoryOption;
	
	@FindBy(xpath="//*[text()='Uniform']")
	private WebElement selectUniform;
	
	@FindBy(xpath="(//div[@class='ql-editor ql-blank'])[1]")
	private WebElement decriptionTxt;
	
	@FindBy(xpath="//input[@id='product-images']")
	private WebElement kitImage;
	
	@FindBy(xpath = "//input[@id='product-size-chart']")
	private WebElement productSizeChart;
	
	@FindBy(xpath="(//button[@role='combobox'])[2]")
	private WebElement kitType;
	
	@FindBy(xpath="//div//span[text()='Core Uniform']")
	private WebElement selectCoreUniform;
	
	@FindBy(xpath="(//button[@role='combobox'])[3]")
	private WebElement genderOption;
	
	@FindBy(xpath="//*[text()='Female']")
	private WebElement femaleGender;
	
	@FindBy(xpath="(//button[@role='combobox'])[4]")
	private WebElement institutionOption;
	
	@FindBy(xpath="//*[text()='New Indian Model School, Dubai']")
	private WebElement selectDubai;
	
	@FindBy(xpath="(//button[@aria-haspopup='dialog'])[1]")
	private WebElement gradeOption;
	
	@FindBy(xpath="//div//span[text()='Middle']")
	private WebElement selectMiddle;
	
	@FindBy(xpath="//input[@placeholder='Search Item Code / Item Name / Barcode']")
	private WebElement itemsOptions;
	
	@FindBy(xpath="(//div[contains(@class,'border rounded-lg')]//button)[1]")
	private WebElement item1;
	
	@FindBy(xpath="(//div[contains(@class,'border rounded-lg')]//button)[2]")
	private WebElement item2;
	
	@FindBy(xpath="(//div[contains(@class,'border rounded-lg')]//button)[3]")
	private WebElement item3;
	
	
	@FindBy(xpath="(//button[@aria-haspopup='dialog'])[2]")
	private WebElement kitStatusType;
	
	@FindBy(xpath="//div//span[text()='Online Kit']")
	private WebElement onlineKit;
	
	@FindBy(xpath="//div//span[text()='Offline Kit']")
	private WebElement offineKit;
	
	@FindBy(xpath="//button[text()='Save Product Kit']")
	private WebElement saveProductkit;
	
	@FindBy(xpath="//div[text()='Product kit added successfully.']")
	private WebElement productKitCreatedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'focus:outline-none')])[2]")
	private WebElement actionButton;

	@FindBy(xpath = "(//div[contains(@role,'menuitem')])[3]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement confirmDeleteButton;
	
	@FindBy(xpath="//div[text()='Product kit deleted successfully.']")
	private WebElement productKitDeletedMessage;
	
	

	
	
	
	public void addNewKit(String name,String img)
	{
		addkitBtn.click();
		kitname.sendKeys(name);
		catagoryOption.click();
		selectUniform.click();
		decriptionTxt.sendKeys(name);
		kitImage.sendKeys(img);
		productSizeChart.sendKeys(img);
		kitType.click();
		selectCoreUniform.click();
		genderOption.click();
		femaleGender.click();
		institutionOption.click();
		selectDubai.click();
		gradeOption.click();
		selectMiddle.click();
		itemsOptions.click();
		item1.click();
		item2.click();
		item3.click();
		kitStatusType.click();
		onlineKit.click();
		offineKit.click();
		saveProductkit.click();
	}
	
	public void deleteProductKit()
	{
		actionButton.click();
		deleteButton.click();
		confirmDeleteButton.click();
		
	}
	
	public String getProductKitCreatedMessage()
	{
		wait.visibilityOf(productKitCreatedMessage, 5);
		return productKitCreatedMessage.getText();
		
	}
	
	public String getProductKitDeletedMessage()
	{
		wait.visibilityOf(productKitDeletedMessage, 5);
		return productKitDeletedMessage.getText();
		
	}

}
