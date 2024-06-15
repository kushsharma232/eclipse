package mb_homeloan_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class homeloan {

  //  static WebDriver driver;

    
	@FindBy(xpath="//input[@id='emailOrMobile']") 
	public static WebElement username ;
	
	@FindBy(xpath="//*[@id=\"password\"]") 
	public static WebElement password ;
	
	@FindBy(xpath="/html/body/header/section[1]/div/div[2]/div[2]/a") 
	public static WebElement Login;
	
	
	public static void username(String input) {
		username.sendKeys(input);
	}

	public static  void password(String input) {
		password.sendKeys(input);
	}
	
	public static  void loginclick() {
		Login.click();
	}
	
	
}
