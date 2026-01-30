package schoolPOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonPages.BasePage;

public class PosReturnPage extends BasePage{

	public PosReturnPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@aria-label='View Order']")
	private WebElement viewBtn;
	
	public void viewFunction()
	{
		viewBtn.click();
	}

}
