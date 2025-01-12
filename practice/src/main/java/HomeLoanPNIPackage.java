import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeLoanPNIPackage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 driver.get("https://www.magicbricks.com/homeloan/assistedpropertysearchandpreapprovedhomeloan");
	     driver.manage().window().maximize();
	     WebElement profileMenu = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/a"));
	     
	     //access View Response 
	     Actions actions = new Actions(driver);
	     actions.moveToElement(profileMenu).perform();
	     //Thread.sleep(4000);
	     WebElement loginbtn = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
	     actions.moveToElement(loginbtn);
	     loginbtn.click();
	     //Thread.sleep(5000);
	     windowSwitch(driver);
	    String parentwindow=driver.getWindowHandle();
	    Set<String> window2=driver.getWindowHandles();
	    Iterator<String> itr2=window2.iterator();
	    while(itr2.hasNext())
	    {
	    String child_window=itr2.next();
	    if(!parentwindow.equals(child_window))
	    {
	    driver.switchTo().window(child_window);
	    System.out.println(driver.switchTo().window(child_window).getTitle());
	    }
	    }
	    WebElement button = driver.findElement(By.id("btnStep1"));
	    WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	    //Thread.sleep(2000);
	    System.out.println("starting");
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("kushsharma232@gmail.com");
	    //Thread.sleep(1000);
	    button.click();
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abcd@1234");
	    //Thread.sleep(1000);
	    loginbutton.click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	    driver.navigate().to("https://www.magicbricks.com/homeloan/home"); 
	    driver.switchTo().window(parentwindow);
	    driver.navigate().refresh();
	    //System.out.println("Refreshing page");

	    driver.navigate().refresh();
	    System.out.println("Page Refreshed");
	    driver.findElement(By.linkText("Buy Now")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.linkText("PAY NOW")).click();
	    driver.findElement(By.cssSelector("div.tenant-cart__action--btn.btn-red.btn-large")).click();
	     
	}

	private static void windowSwitch(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
