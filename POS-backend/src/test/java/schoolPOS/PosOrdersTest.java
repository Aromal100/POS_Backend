package schoolPOS;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class PosOrdersTest extends BaseTest{
	
	@Test(priority = 1)
	public void openPosOrderPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		PosOrders po= new PosOrders(driver);
		try
		{
		  test.info("Navigating the POS order page");
		  sp.openPosOrders();
//		  test.info("Check the search function of the POS order page");
		  //po.checkSearch(p.getProperty("PosOrderID"));
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("posorders"), 
					"POS order page did not open. URL: " + url);
		  test.pass("POS order page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void viewOrdersId()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		PosOrders po= new PosOrders(driver);
		try
		{
		  test.info("Navigating the POS order page");
		  sp.openPosOrders();
		  test.info("Check the view function of the POS order ID ");
		  po.viewOrderId();
		  test.pass("POS order id view function is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	

}
