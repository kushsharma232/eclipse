package practice1;

	import java.time.Duration;
import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class correctionHL {


	private static void windowSwitch(WebDriver driver) {
	// TODO Auto-generated method stub
	}

	@SuppressWarnings({ "null" })
	public static void main(String[] args) throws InterruptedException {
	 // System.out.println("Hello World!");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.get("https://www.magicbricks.com/homeloan/home");
	driver.manage().window().maximize();

	//WebElement mainMenu = driver.findElement(By.xpath("//header/section[1]/div[1]/div[2]/div[2]/a[1]"));

	//Instantiating Actions class
	//Actions actions = new Actions(driver);

	//Hovering on Login
	//WebElement mainMenu1 = driver.findElement(By.linkText("Login"));
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
	driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("kushsharma232.com");
	//Thread.sleep(1000);
	button.click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Time@1234");
	//Thread.sleep(1000);
	loginbutton.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://www.magicbricks.com/homeloan/home");
	driver.switchTo().window(parentwindow);
	driver.navigate().refresh();
	//System.out.println("Refreshing page");

	System.out.println("Page Refreshed");
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"loanAmount\"]")).sendKeys("100000"); //loanamountfield
	System.out.println("100000");
	/*driver.findElement(By.xpath("//*[@id=\"terms\"]/label")).click();
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("document.getElementById('tnc-checkbox').click();");
	//driver.findElement(By.className("home-loan_main-form_tnc--label::after")).click();
	Thread.sleep(3000);*/
	   // Click on get started button
	driver.findElement(By.xpath("//a[@id='generate-otp']")).click();

	FluentWait<WebDriver> w = null;
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("generate-otp")));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generate-otp")));
	driver.findElement(By.id("generate-otp")).click();
	//Thread.sleep(5000);
	System.out.println("Getstarted");
	driver.findElement(By.xpath("//*[@id=\"hlname\"]")).sendKeys("Kush Sharma");
	driver.findElement(By.xpath("//*[@id=\"hlincome\"]")).sendKeys("10000");
	driver.findElement(By.id("shortlistedY")).click();
	driver.findElement(By.xpath("//*[@id=\"NameCityOnly\"]")).sendKeys("ghaziab");




	}

	}


	