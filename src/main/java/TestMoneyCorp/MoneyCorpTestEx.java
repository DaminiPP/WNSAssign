package TestMoneyCorp;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.BaseClass;
import com.test.MoneyCorp;

public class MoneyCorpTestEx extends BaseClass{
	MoneyCorp moneyCorp = new MoneyCorp();
	
	public MoneyCorpTestEx() {
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initialization();
		moneyCorp =  new MoneyCorp();
	}
	
	@Test(priority=1)
	public void validateSelectLang(){
	moneyCorp.selectLang();
	String	ExpectedURL= "https://www.moneycorp.com/en-us/search/";
	String ActualURL= driver.getCurrentUrl();
	Assert.assertEquals(ExpectedURL, ActualURL);
	}
	
	@Test(priority=2)
	public void SearchingPayment() {
		String ExpectedSearchurl="https://www.moneycorp.com/en-us/search/?q=international+payments";
		String ActualSearchURL= driver.getCurrentUrl();
		Assert.assertEquals(ExpectedSearchurl, ActualSearchURL);
	}
	
	
	@AfterClass
	public void exit(){
		driver.quit();
	}
	
	
	

}
