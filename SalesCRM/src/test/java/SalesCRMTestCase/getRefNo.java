package SalesCRMTestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CRM.Base.BaseClass;
import SaleCRMPages.HLHomepage;
import SaleCRMPages.LoginPage;

public class getRefNo extends BaseClass {
	HLHomepage homepage;
	LoginPage loginPage;;
	
	public getRefNo()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initilization();
		//homepage= new HLHomepage();
		loginPage= new LoginPage();
		loginPage.login(prop.getProperty("uname"),prop.getProperty("pwd"));
		
	}
	
	@Test(priority=1)
	public void ref_no() throws Exception
	{
	homepage.number();
	}
}