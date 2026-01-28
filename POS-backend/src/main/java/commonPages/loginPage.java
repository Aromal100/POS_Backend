package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(id = "password")
	private WebElement passField;

	@FindBy(id = "remember")
	private WebElement rememberBox;

	@FindBy(xpath = "//button//span[text()='Sign In']")
	private WebElement signInbutton;

	public void loginPOSAdmin(String email,String pass)
	{
		emailField.sendKeys(email);
		passField.sendKeys(pass);
		rememberBox.click();
		signInbutton.click();
	}

}
