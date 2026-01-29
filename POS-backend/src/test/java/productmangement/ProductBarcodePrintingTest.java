package productmangement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;
import projectmanagement.ProductBarcodePrintingPage;


@Listeners(ExtentTestListener.class)
public class ProductBarcodePrintingTest extends BaseTest{
	
	@Test(priority = 1)
	public void productBarcodePrintingTest() {
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		ProductBarcodePrintingPage pbp = new ProductBarcodePrintingPage(driver);
		try {
			test.info("Opening the Product Barcode Printing Module");
			sp.openPrintBarcodePrinting();
			test.info("Entering no of prints that is required");
			pbp.enterNoOfPrints("5");
			pbp.selectChkBox();
			test.info("Click the print barcode button top get the prints");
			pbp.clickPrintBarcodes();

			String expectedMessage = pbp.getPdfDownloadedMessage();
			Assert.assertEquals(expectedMessage, "PDF downloaded successfully.");
			test.pass("PDF downloaded successfully.");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	
	
	@Test
	public void verifyFilterFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		ProductBarcodePrintingPage pbp = new ProductBarcodePrintingPage(driver);
		try {
			test.info("Opening the Weight Management");
			sp.openPrintBarcodePrinting();
			test.info("Check the filter functon");
			pbp.clickfilterOption();
			pbp.selectBook();
			test.pass("Filter function is working properly");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void checkSearchFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		ProductBarcodePrintingPage pbp = new ProductBarcodePrintingPage(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openPrintBarcodePrinting();

		test.info("Check the search box function");
		pbp.checkSearchBox(p.getProperty("productName"));
		test.pass("Search box function working successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	


}
