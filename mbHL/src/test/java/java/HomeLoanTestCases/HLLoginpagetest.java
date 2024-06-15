package java.HomeLoanTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import HomeLoanPages.HLHomepage;
import HomeLoanPages.HLLoginpage;


public class HLLoginpagetest extends Base {
	
	private HLHomepage homePage;
	 HLLoginpage loginPage;

	
	@BeforeMethod
	public void setup() {
		initilization();
		loginPage= new LoginPage(driver);
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		//loginPage.login(prop.getProperty("uname"),prop.getProperty("pwd"));
			//String title =loginPage.loginPageTitle();	
			//Assert.assertEquals(title, "User Login");
			Thread.sleep(5000);
			homePage.clickOnHomeLoanHeader();
			Thread.sleep(3000);
			homePage.clickOnHomeLoan();
	}
	
	@Test(enabled=false) 
	public void logintest() throws Exception 
	{
		loginPage.login(prop.getProperty("uname"),prop.getProperty("pwd"));
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void closedriver() {
		
		driver.quit();
	}
	
	
}

}
