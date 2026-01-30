package settings;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class EmailSettingsTest extends BaseTest{

	@Test
	public void openEmailSettingsPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
			test.info("Navigating to the Email settings page");
			sp.openEmailSettings();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("emailsettings"), 
					"Email settings page did not open. URL: " + url);
			test.pass("Email settings page opened successfully");
			
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
			
		}
	
	}
	
}
