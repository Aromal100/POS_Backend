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
	
	@Test(priority = 1)
	public void openPosReturnPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
		  test.info("Navigating the POS Return page");
		  sp.openPosReturn();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("posreturn"), 
					"POS Return page did not open. URL: " + url);
		  test.pass("POS Return page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void viewPosReturnId()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		PosReturnPage pr=new PosReturnPage(driver);
		try
		{
		  test.info("Navigating the POS Return page");
		  sp.openPosReturn();
		  test.info("Check the view function of the POS order ID ");
		  pr.viewFunction();
		  test.pass("POS Return order id view function is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
