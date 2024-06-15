package java.HomeLoanTestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.qa.base.TestBase;

import HomeLoanPages.HLHomepage;
import HomeLoanPages.HLLoginpage;

public class HLlogin extends Base {
	private HLHomepage homePage;
	private HLLoginpage loginPage;

	@BeforeTest
	public void setup() {
		initilization();
		homePage=new HLHomepage(driver);
		loginPage= new HLLoginpage(driver);
		
	}
@BeforeMethod
public void loginMagicBricks() throws EncryptedDocumentException, IOException, InterruptedException {
	//loginPage.login(prop.getProperty("uname"),prop.getProperty("pwd"));
	Thread.sleep(5000);
}

@Test
public void postPropertyByOMBanner() throws InterruptedException {
	
	homePage.clickOnHomeLoanHeader();
	Thread.sleep(4000);
	homePage.clickOnHomeLoan();

}

}
