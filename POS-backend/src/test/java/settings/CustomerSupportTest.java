package settings;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class CustomerSupportTest extends BaseTest{
	
	@Test(priority = 1)
	public void openCustomerSupportPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
			test.info("Navigting to the Customer Support page");
			sp.openCustomerSupport();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("chat"),"Customer Support page did not open URL:"+url);
			test.pass("Customer Support page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void checkTheSearchFunctonality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		CustomerSupportPage cs= new CustomerSupportPage(driver);
		try
		{
			test.info("Navigting to the Customer Support page");
			sp.openCustomerSupport();
			test.info("Check the customer support search functionality");
			cs.checkSearchCustomer(p.getProperty("customer"));
			test.pass("Customer support search functionality is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void checkTheChatFunctonality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		CustomerSupportPage cs= new CustomerSupportPage(driver);
		try
		{
			test.info("Navigting to the Customer Support page");
			sp.openCustomerSupport();
			test.info("Check the customer support chat functionality");
			cs.chatCustomer("Hi");
			test.pass("Customer support chat functionality is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	
	
	

}
