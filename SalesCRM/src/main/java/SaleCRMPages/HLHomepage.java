package SaleCRMPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CRM.Base.BaseClass;

public class HLHomepage extends BaseClass  {
	
	Actions action;
	
	//public WebDriverWait wait;

	@FindBy(linkText="Home Loans")
	public static WebElement  homeloan_link;
	
	@FindBy(xpath="//ul[@class='drop-links']//a[contains(text(),'Home Loans')]")
	public static WebElement homeloan_link2;
	
	@FindBy(xpath="(//div[contains(text(),'Reference No.')])[2]")
	public static WebElement refrence_number;
	
	public HLHomepage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void number() throws Exception
	{
		action = new Actions(driver); 		
		action.moveToElement(homeloan_link).click().perform();
		Thread.sleep(3000);
		homeloan_link2.click();
		
		
		 //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                
            }
        }
		Thread.sleep(2000);
	
		refrence_number.getText();
}
}