package productmangement;

import java.time.format.TextStyle;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;
import projectmanagement.RateManagementPage;

@Listeners(ExtentTestListener.class)
public class RateManagementTest extends BaseTest{
	
	@Test
	public void verifyEnterNewRate()
	{
	
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		RateManagementPage  rp= new RateManagementPage(driver);
		try
		{
			test.info("Navigate to the Rate Management module");
			sp.openRateManagement();
			test.info("Verifying the Enter add new rate function");
			rp.enterRate("9");
			rp.clickSave();
			String expectedMessage=rp.getProductRateUpdatedMessage();
			Assert.assertEquals(expectedMessage, "Product rates updated successfully.");
			test.pass("Product rates updated successfully.");
		}
		catch(Exception e)
		{
			test.fail("failed"+e.getMessage());
			throw e;
		}
		
	}
	

}
