package java.HomeLoanTestCases;

import java.qa.base.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomeLoanPages.HLApplicationform;


public class HLApplicationformtest extends Base{
	private HLApplicationform hLApplicationform;
    private HLlogin hLLoginPage;
	private WebDriver driver;
	
	
//	Applicationform formHL;
	
//	public Applicationfromtest()
//	{
//		super();
//	}
	@BeforeTest
	public void object() {
		hLApplicationform=new HLApplicationform(driver);
		hLLoginPage= new HLlogin(driver);
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
//		formHL= new Applicationform(driver);
		driver.get("https://www.magicbricks.com/homeloan/home/");
		Thread.sleep(5000);
		hLLoginPage.moveOnLoginButton();
		Thread.sleep(5000);
		hLLoginPage.clickOnLogin();
		hLLoginPage.login(homeloan, homeloan);
		String title=hLLoginPage.loginPageTitle();
		System.out.println(title);
	}
	
	@Test
	public void HLform(){
		hLApplicationform.entermonthlyincome();
		hLApplicationform.checkeligibility();
		hLApplicationform.clearname();
		hLApplicationform.entername();
		hLApplicationform.loanamount();
		hLApplicationform.propertyshortlistedY();
		hLApplicationform.city();
		hLApplicationform.propertycity();
		hLApplicationform.citydropdown();
		hLApplicationform.propertyvalue();
		hLApplicationform.continuebutton();
		hLApplicationform.clearemail();
		hLApplicationform.email();
		hLApplicationform.clearage();
		hLApplicationform.age();
		hLApplicationform.gender();
		hLApplicationform.secondcontinue();
		hLApplicationform.employmenttype();
		hLApplicationform.ongoingemi();
		hLApplicationform.creditscoreY();
		hLApplicationform.entercreditscore();
		hLApplicationform.coapplicantN();
		hLApplicationform.submitbutton();
	}
	

	}

