package settings;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;

@Listeners(ExtentTestListener.class)
public class DeliveryPartnerTest extends BaseTest{
	
	@Test(priority = 1, description = "Verify Delivery Partner Page Navigation")
	public void openDelveryPartnerPage()
	{
		ExtentTest test=ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		try
		{
			test.info("Navigating to the Delivery partner page");
			sp.openDeliveryPartner();
			String url=driver.getCurrentUrl();
			assertTrue(url.contains("deliverypartner"),"Delivery partner page did not open. URL: " + url);
			test.pass("Delivery partner page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2, description = "Verify Search Functionality On Delivery Partner Page")
	public void verifyTheSearchFunctionality()
	{
		ExtentTest test=ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		DeliveryPartnerPage dp= new DeliveryPartnerPage(driver);
		try
		{
			test.info("Navigating to the Delivery Parner page");
			sp.openDeliveryPartner();
			test.info("Check the Search functionality of Delivery partner");
			dp.checkSearch(p.getProperty("DeliveryPartner"));
			test.pass("Serach functionality of the Delivery partner is working fine");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3, description = "Verify View Functionality On Delivery Partner Page" )
	public void viewDeliveryPartner()
	{
		ExtentTest test=ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		DeliveryPartnerPage dp= new DeliveryPartnerPage(driver);
		
		try
		{
			test.info("Navigating to the Delivery Parner page");
			sp.openDeliveryPartner();
			test.info("Check the view delivery partner function of Delivery partner");
			dp.checkViewPartner();
			test.info("Verify the update function of delivery partner");
			dp.enterMiniKg("9");
			String actualMessage=dp.getDeliveryPartnerUpdatedMessage();
		    assertEquals(actualMessage, "Delivery partner updated successfully.");
			test.pass("The view delivery partner and update function of Delivery partner is working fine");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
