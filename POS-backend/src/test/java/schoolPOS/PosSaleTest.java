package schoolPOS;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;


@Listeners(ExtentTestListener.class)
public class PosSaleTest extends BaseTest{
	
	@Test
	public void openPosSalePage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
		  test.info("Navigating the POS Sale page");
		  sp.openPosSale();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("possale"), 
					"POS Sale page did not open. URL: " + url);
		  test.pass("POS Sale page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
		}
	}
	

}
