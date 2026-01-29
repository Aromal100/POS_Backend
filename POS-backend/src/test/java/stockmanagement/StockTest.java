package stockmanagement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class StockTest extends BaseTest{
	
	@Test(priority = 3)
	public void verifyTheProductInTable() throws Exception
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockPage stockPage= new StockPage(driver);

		try {
			test.info("Opening to the stock management module");
			sp.openStock();
			test.info("Checking the Search Box functionality");
			stockPage.checkSearch(p.getProperty("productName"));
			test.pass("Search box function is working successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 1)
	public void checkingTheChangeStatusToOffline()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockPage stockPage= new StockPage(driver);
		try {
			test.info("Opening to the stock management module");
			sp.openStock();
			test.info("Checking the change status to offline function");
			stockPage.changeStatusToOffline();
			String expectedMessage= stockPage.getOfflineStatusChangeMessage();
			Assert.assertEquals(expectedMessage, "Status changed to offline for 10 item(s).");
			test.pass("Status changed to offline successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void checkingTheChangeStatusToOnline()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockPage stockPage= new StockPage(driver);
		try {
			test.info("Opening to the stock management module");
			//sp.openStock();
			test.info("Checking the change status to online function");
			stockPage.changeStatusToOnline();
			String expectedMessage= stockPage.getOnlineStatusChangeMessage();
			Assert.assertEquals(expectedMessage, "Status changed to online for 10 item(s).");
			test.pass("Status changed to online successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
