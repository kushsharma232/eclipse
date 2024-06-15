package SaleCRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CRM.Base.BaseClass;

	public class LoginPage extends BaseClass{
		
	@FindBy(xpath="//input[@id='emailOrMobile']") 
	public static WebElement username ;
	
	@FindBy(xpath="//*[@id=\"password\"]") 
	public static WebElement password ;
	
	@FindBy(xpath="//button[@id='btnStep1']") 
	public static WebElement nextbutton;
	
	@FindBy(xpath="//button[@id='btnLogin']") 
	public static WebElement loginbutton;
	
	//@FindBy(xpath = "//div[@class = ('mb-header__main__login js-menu-container')] [1]")
	//public static WebElement login;

		
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HLHomepage login(String uname,String pwd) throws Exception
	{
		username.sendKeys(uname);
		nextbutton.click();
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new HLHomepage();
		
	}
	
	

}

