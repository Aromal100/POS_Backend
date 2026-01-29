package stockmanagement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;

public class StocksPage extends BasePage{

	public StocksPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//table[contains(@class,'min-w-full')]")
	private WebElement stockTable;
	
	
	@FindBy(xpath = "//table//tbody//tr")
	private List<WebElement> stockTableRows;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[2]")
	private WebElement uniformOption;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchBox;

	
	
	public boolean isStockTableDisplayed() {
		return stockTable.isDisplayed();
	}
	
	public int getStockTableRowCount() {
		return stockTableRows.size();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
	
	public void selectUniform()
	{
		filterBtn.click();	
		uniformOption.click();
	}
	
	public void enterSearch(String product)
	{
		searchBox.sendKeys(product);
	}

}
