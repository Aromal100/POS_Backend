package productmangement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;
import projectmanagement.ProductKitPage;

@Listeners(ExtentTestListener.class)
public class ProductKitTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyingAddNewProductKit()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		ProductKitPage pk= new ProductKitPage(driver);
		try
		{
			test.info("Opening the Product kit page");
			sp.openProductKit();
			test.info("Verifying the add new kit function");
			pk.addNewKit("POS Uniform",p.getProperty("uniformImage"));
			
			String expectedMessage=pk.getProductKitCreatedMessage();
			Assert.assertEquals(expectedMessage, "Product kit added successfully.");
			test.pass("Product kit added successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("failed"+e.getMessage());
			throw e;
		}
		
	}
	
	@Test(priority = 2)
	public void verifyDeleteFunction()
	{
		
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		ProductKitPage pk= new ProductKitPage(driver);
		try
		{
			test.info("Opening the Product kit page");
			//sp.openProductKit();
			test.info("Verifying the delete product kit function");
			pk.deleteProductKit();
			String expectedMessage=pk.getProductKitDeletedMessage();
			Assert.assertEquals(expectedMessage, "Product kit deleted successfully.");
			test.pass("Product kit deleted successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
