package mb_HomeLoan;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepack extends Loginpage1 {
	static WebDriver driver;
	public  Basepack(WebDriver driver) {
		Basepack.driver = driver; 
		//PageFactory.initElements(driver, this);	}

}
}