package schoolPOS;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class PosReturnTest extends BaseTest{
	
	@Test
	public void openPosReturnPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
		  test.info("Navigating the POS Return page");
		  sp.openPosExchange();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("posorders"), 
					"POS Exchange page did not open. URL: " + url);
		  test.pass("POS Exchange page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void viewPosExcahngeId()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		PosExchangePage pe= new PosExchangePage(driver);
		try
		{
		  test.info("Navigating the POS Exchange page");
		  sp.openPosExchange();
		  test.info("Check the view function of the POS order ID ");
		  pe.viewFunction();
		  test.pass("POS order id view function is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
