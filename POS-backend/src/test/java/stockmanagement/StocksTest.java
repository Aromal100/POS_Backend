package stockmanagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import baseTest.BaseTest;
import commonPages.SidePage;



@Listeners(ExtentTestListener.class)
public class StocksTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyStockTable() {
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksPage stocksPage= new StocksPage(driver);
		try {
			test.info("Opening to the stock management module");
			sp.openStocks();
			assertTrue(stocksPage.isStockTableDisplayed(), "Stock table is NOT displayed!");
			System.out.println("Stock table is displayed");
			test.pass("Stock table is displayed");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}

	@Test(priority = 2)
	public void verifyStockTableRowCount() {
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksPage stocksPage= new StocksPage(driver);

		try {
			test.info("Opening to the stock management module");
			sp.openStocks();
			test.info("Verify the stock table has how many rows");
			int rowCount = stocksPage.getStockTableRowCount();
			System.out.println("Number of rows in a stock table: " + rowCount);
			test.pass("Number of rows in a stock table: " + rowCount);
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 3)
	public void navigateThroughStockPages() {
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksPage stocksPage= new StocksPage(driver);

		try {
			test.info("Opening to the stock management module");
			sp.openStocks();
			test.info("Clicking on the pagenation of stock table");
			stocksPage.clickNextButton();
			System.out.println("Navigated to the next page of the stock table.");
			test.pass("Navigated to the next page of the stock table.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 4)
	public void verifyFilterFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksPage stocksPage= new StocksPage(driver);

		try {
			test.info("Opening to the stock management module");
			sp.openStocks();
			test.info("Checking the filter function");
			stocksPage.selectUniform();
			test.pass("Filter has been selected successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	
	@Test(priority = 5)
	public void verifyTheProductInTable() throws Exception
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePage sp= new SidePage(driver);
		StocksPage stocksPage= new StocksPage(driver);

		try {
			test.info("Opening to the stock management module");
			sp.openStocks();
			test.info("Checking the Search Box functionality");
			stocksPage.enterSearch(p.getProperty("productName"));
			test.pass("Search box function is working successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	

}
