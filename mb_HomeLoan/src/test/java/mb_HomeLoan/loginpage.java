package mb_HomeLoan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage extends Loginpage1 {
static WebDriver driver;
	
	@FindBy(xpath = "//div[@class = ('mb-header__main__login js-menu-container')] [1]")
	public static WebElement login;
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(loginpage.driver, driver);
	
	}
	
	public static void login(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(login).perform();
		
	}
	//@Test(priority = 1)
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://www.magicbricks.com/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginpage.login(driver);
	}
	
}
