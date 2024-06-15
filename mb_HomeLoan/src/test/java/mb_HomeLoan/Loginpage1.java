package mb_HomeLoan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import mb_homeloan_pages.homeloan;

public class Loginpage1 {

	public static WebDriver driver ;
	
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		driver.get("https://accounts.magicbricks.com/userauth/login");
		//homeloan obj=new homeloan(driver);
		homeloan.username("kushsharma232@gmail.com");
		homeloan.loginclick();	
		homeloan.password("time@1234");
		homeloan.loginclick();
		
		
	}
}
