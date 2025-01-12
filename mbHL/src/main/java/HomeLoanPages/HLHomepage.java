package HomeLoanPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class HLHomepage extends Base{
private WebDriver driver;
	@FindBy(xpath="(//a[text()='Home Loans'])[1]")
	private WebElement homeLoanHeader;

	@FindBy(xpath="(//a[text()='Home Loans'])[2]")
	private WebElement homeLoanClick;
	
	public HLHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomeLoanHeader() {
		Actions act=new Actions(driver);
		act.moveToElement(homeLoanHeader).click().perform();
	//homeLoanHeader.click();
		
	}
	
	public void clickOnHomeLoan() {
		homeLoanClick.click();
	}
	
	
}

