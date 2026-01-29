package stockmanagement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class StocksAllotmentTest extends BaseTest{
	
	@Test(priority = 1)
	public void checkTheFilterFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksAllotment sa= new StocksAllotment(driver);
		try
		{
		  test.info("Opening to the Stock allotment page");	
		  sp.openStocksAllotment();
		  test.info("Check the filter functionality and select the uniform option");
		  sa.selectFilterToUniform();
		  test.pass("Filter function is working successfully");
		}
		catch(Exception e)
		{
		  test.fail("Failed"+e.getMessage());
		  throw e;
		  
		}
	}
	
	@Test(priority = 2)
	public void checkTheSearchFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksAllotment sa= new StocksAllotment(driver);
		try
		{
		  test.info("Opening to the Stock allotment page");	
		  sp.openStocksAllotment();
		  test.info("Check the Search functionality of the Stocks allotment");
		  sa.checkSearch(p.getProperty("GTNno"));
		  test.pass("Search functionality is working successfully");
		}
		catch(Exception e)
		{
		  test.fail("Failed"+e.getMessage());
		  throw e;
		  
		}
	}
	
	@Test(priority = 3)
	public void verifyingAddingRecievedQty()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksAllotment sa= new StocksAllotment(driver);
		try
		{
		  test.info("Opening to the Stock allotment page");	
		  sp.openStocksAllotment();
		  test.info("Check the adding Recieved Qty of the Stocks allotment");
		  sa.addRecivedQty("9");
		  String expectedMessage=sa.getStockStatusUpdatedMessage();
		  Assert.assertEquals(expectedMessage, "Stock status updated successfully");
		  test.pass("Adding the recieved qty and saved successfully");
		}
		catch(Exception e)
		{
		  test.fail("Failed"+e.getMessage());
		  throw e;
		  
		}
	}
	
	

}
