package dashboardTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;
import dashBoardPages.SchoolStoreDashboardPage;

@Listeners(ExtentTestListener.class)
public class SchoolStoreDashboardTest extends BaseTest{
	
	
	
	
	@Test
	public void verifySchoolStoreDashboard()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp = new SidePage(driver);
		SchoolStoreDashboardPage ssdp=new  SchoolStoreDashboardPage(driver);
		
		try
		{
			test.info("Open the School Store Dashboard page");
			sp.openSchoolStoreDashboard();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("school-store-dashboard"), 
					"School Store Dashboard page did not open. URL: " + url);
				test.pass("School Store Dashboard page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
			
		}
		
	}

}
