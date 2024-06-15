package java.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Properties CONFIG;
	public static String homeloan;
	
	public Base() {
		
		try {
		prop =new Properties();
        FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/Config.properties");
        prop.load(cn);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();	
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
	}
	
	public static void initilization()
	{
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//String chromedriver = CONFIG.getProperty("chromedriverpath");
	        //System.setProperty("webdriver.chrome.driver", chromedriver);
		}
		if(browsername.equals("ff"))
		{
			String geckodriver = CONFIG.getProperty("gekodriverpath");
	        System.setProperty("webdriver.gecko.driver",geckodriver);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
}
	
	
	
	

