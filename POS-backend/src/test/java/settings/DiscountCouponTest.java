package settings;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;


@Listeners(ExtentTestListener.class)
public class DiscountCouponTest extends BaseTest{
	
	@Test(priority = 1,description = "Verify the Filter Functionality of the Discount Coupon")
	public void verifyFilterFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try {
			test.info("Opening the Discount coupon page");
			sp.openDiscountCoupon();
			test.info("Checking the filter function");
			dp.selectFilter();
			test.pass("Filter has been selected successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	
	@Test(priority = 2,description = "Verify Add Discount Coupon Functionality")
	public void verifyAddDiscountCouponFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try
		{
			test.info("Opening the Discount coupon page");
			sp.openDiscountCoupon();
			test.info("Checking the add coupon functionality");
			dp.clickDiscountCoupon();
			dp.selectInstitution();
			dp.enterEmail(p.getProperty("mail"));
			dp.autoGenerateCode();
			dp.enterCouponAmount("100");
			dp.clickSave();
			
			String actualMessage=dp.getCouponCreatedMessage();
			Assert.assertEquals(actualMessage, "Discount coupon added successfully.");
			
			test.pass("Add coupon function working as successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3,description = "Verify Search Function Of Discount Coupon")
	public void verifyTheSearchBarFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try
		{
			test.info("Opening the Discount coupon page");
			sp.openDiscountCoupon();
			test.info("Checking the Search Box functionality");
			
			String coupon=dp.getCouponText();
			dp.checkSearchBar(coupon);
			
			test.pass("Search box function is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}


}
