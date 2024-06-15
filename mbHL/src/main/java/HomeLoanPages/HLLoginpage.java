package HomeLoanPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

	
public class HLLoginpage extends Base{
	private WebDriver driver;
	@FindBy(xpath="/html/body/header/section[1]/div/div[2]/div[2]/a")
    private WebElement moveOnLogin;
    
    @FindBy(xpath="(//a[text()='Login'])[2]")
    private WebElement clickOnLogin;
		
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

		
	public HLLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void moveOnLoginButton() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(moveOnLogin).build().perform();
        Thread.sleep(4000);
        clickOnLogin.click();
        
    }
    
    public void clickOnLogin() {
        clickOnLogin.click();
    }
	
	public void login(String uname,String pwd)
	{
		username.sendKeys("kushsharma232@gmail.com");
		nextbutton.click();
		password.sendKeys("time@1234");
		loginbutton.click();
		
	}
	
	

}
