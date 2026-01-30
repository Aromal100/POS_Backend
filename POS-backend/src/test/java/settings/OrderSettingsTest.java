package settings;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class OrderSettingsTest extends BaseTest{

	@Test
	public void openTheOrderSettingsPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
			test.info("Navigating to the Order settings page");
			sp.openOrderSettings();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("ordersettings"), 
					"Order settings page did not open. URL: " + url);
			test.pass("Order settings page opened successfully");
			
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
			
		}
	}
	
}
