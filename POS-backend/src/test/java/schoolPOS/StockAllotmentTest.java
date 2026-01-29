package schoolPOS;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class StockAllotmentTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyAddingTransferStock()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockAllotmentPage sa= new StockAllotmentPage(driver);
		try
		{
			test.info("Navigating to the Stock Allotment page ");
			sp.openStockAllotment();
			test.info("Verifying the Add transfer Stock functionality");
			sa.addTransferStock("Stock","9");
			String expectedMessage=sa.getStockSavedMessage();
			Assert.assertEquals(expectedMessage,"Stock allotment saved successfully");
			test.pass("Add transfer stock function is working successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void checkSearchFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockAllotmentPage sa= new StockAllotmentPage(driver);
		try
		{
			test.info("Navigating to the Stock Allotment page ");
			sp.openStockAllotment();
			test.info("Verifying the Serach box functionality of Stock Allotment");
			
			String gtnNumber=sa.getNewGtnNo();
			
			
			sa.checkSearch(gtnNumber);
			test.pass("Search Box function is working successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void checkEditFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockAllotmentPage sa= new StockAllotmentPage(driver);
		try
		{
			test.info("Navigating to the Stock Allotment page ");
			sp.openStockAllotment();
			test.info("Verifying the edit functionality of Stock Allotment");
			sa.editTransferStock("edited", "8");
			String actualMessage=sa.getStockUpdatedMessage();
			Assert.assertEquals(actualMessage, "Stock details updated successfully");
			
			test.pass("Stock details edited successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 4)
	public void checkDeleteFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StockAllotmentPage sa= new StockAllotmentPage(driver);
		try
		{
			test.info("Navigating to the Stock Allotment page ");
			//sp.openStockAllotment();
			test.info("Verifying the Delete functionality of Stock Allotment");
			sa.deleteTransferStock();
			String actualMessage=sa.getStockAllotmentDeletedMessage();
			Assert.assertEquals(actualMessage, "Stock allotment deleted successfully");
			
			test.pass("Stock allotment deleted successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	

}
