package CRM.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static Properties CONFIG;
	public static String homeloan;
	public static Logger log=Logger.getLogger(BaseClass.class);
	public BaseClass() {
		
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
		ChromeOptions options=new ChromeOptions();
    	 PropertyConfigurator.configure("C:\\Users\\Shivam.Sharma\\Downloads\\wetransfer_pom-framework_2023-07-03_0918\\HomeLoanTest\\src\\main\\resource\\log4j\\log4j");
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
    	 
    	 
//    	 WebDriverManager.chromedriver().setup();//Syntax error on token ".", { expected
 //   	    WebDriver driver = new ChromeDriver();
    	 	options.addArguments("--disable-notifications");	
			driver = new ChromeDriver(options);
			//String chromedriver = CONFIG.getProperty("chromedriverpath");
	        //System.setProperty("webdriver.chrome.driver", chromedriver);
		}
		if(browsername.equals("ff"))
		{
			String geckodriver = CONFIG.getProperty("gekodriverpath");
	        System.setProperty("webdriver.gecko.driver",geckodriver);
//		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	
	}
}

