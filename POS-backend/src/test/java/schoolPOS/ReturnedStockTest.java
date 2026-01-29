package schoolPOS;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class ReturnedStockTest extends BaseTest{
	
	@Test
	public void openReturnedStockPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
		  test.info("Navigating the Returned Stock page");
		  sp.openReturnedStock();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("stock/return"), 
					"Returned Stock page did not open. URL: " + url);
		  test.pass("Returned Stock page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
		}
	}


}
