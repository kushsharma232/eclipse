package practice1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shivam {

	public shivam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id=\"rtrip\"]")).click();
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		driver.findElement(By.xpath("//input[@id='a_FromSector_show']")).sendKeys("new");
		driver.findElement(By.xpath("//span[@id='spnNew Delhi'] ")).click();
		driver.findElement(By.xpath("//input[@id='Editbox13_show'] ")).click();
		driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Ahmedabad");
		driver.findElement(By.xpath("//span[@id='spnAhmedabad']")).click();
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		driver.findElement(By.xpath("//li[@id='fiv_0_23/04/2023']")).click();
		driver.findElement(By.xpath("//input[@id='rdate']")).click();
		driver.findElement(By.xpath("//li[@id='snd_1_08/05/2023']")).click();
		driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.id("add")).click();
		}
		for (int i = 1; i <= 2; i++) {
			driver.findElement(By.xpath("(//button[@class='add plus_boxChd'])[1]")).click();
		}
		for (int i = 1; i < 2; i++) {
			driver.findElement(By.xpath("(//button[@class='add plus_box1Inf'])[1]")).click();
		}
		for (int i = 1; i >= 2; i--) {
			driver.findElement(By.xpath("//button[@id='asub']")).click();
		}
		driver.findElement(By.xpath("//label[@id='lbpEconomy']")).click();
		driver.findElement(By.xpath("(//label[@class='container_df'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='srchBtnSe']")).click();
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDropBy(slider, -50, 0).perform();
		driver.findElement(By.xpath("//div[@id='BtnBookNow']")).click();
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver; Object element1 =
		 * executor; executor.executeScript("arguments[0].scrollIntoView(true);",
		 * element1); //js.executeScript("window.scrollBy(0,1000)");
		 */
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='checkmark-heduredi'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='checkmark-heduredi'])[9]")).click();
		driver.findElement(By.xpath("(//a[@class='countnbtn'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[6]")).click();
		driver.findElement(By.xpath("//input[@id='txtEmailId']")).click();
		driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//span[@id='spnVerifyEmail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='titleAdult0']")).click();
		driver.findElement(By.xpath("//select[@id='titleAdult0']/child::option[4]")).click();
		driver.findElement(By.xpath("(//input[@id='txtFNAdult0'])")).sendKeys("shubham");
		driver.findElement(By.xpath("(//input[@id='txtLNAdult0'])")).sendKeys("sharma");
		driver.findElement(By.xpath("(//a[@class='add_adlt'])")).click();
		driver.findElement(By.xpath("(//select[@id='titleAdult1'])")).click();
		driver.findElement(By.xpath("//select[@id='titleAdult1']/child::option[2]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNAdult1']")).sendKeys("kush");
		driver.findElement(By.xpath("//input[@id='txtLNAdult1']")).sendKeys("sharma");
		driver.findElement(By.xpath("(//a[@class='add_adlt'])")).click();
		driver.findElement(By.xpath("//select[@id='titleAdult2']/child::option[3]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNAdult2']")).sendKeys("naina");
		driver.findElement(By.xpath("//input[@id='txtLNAdult2']")).sendKeys("sharma");
		driver.findElement(By.xpath("(//a[@class='add_adlt'])")).click();
		driver.findElement(By.xpath("//select[@id='titleAdult3']/child::option[3]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNAdult3']")).sendKeys("shubhita");
		driver.findElement(By.xpath("//input[@id='txtLNAdult3']")).sendKeys("aggarwal");
		driver.findElement(By.xpath("//select[@id='titleChild0']")).click();
		driver.findElement(By.xpath("//select[@id='titleChild0']/child::option[3]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNChild0']")).sendKeys("aduvait");
		driver.findElement(By.xpath("//input[@id='txtLNChild0']")).sendKeys("aggarwal");
		driver.findElement(By.xpath("//a[@ng-if='NoChd >0']")).click();
		driver.findElement(By.xpath("//select[@id='titleChild1']")).click();
		driver.findElement(By.xpath("//select[@id='titleChild1']/child::option[2]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNChild1']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@id='txtLNChild1']")).sendKeys("aggarwal");
		driver.findElement(By.xpath("//select[@id='titleInfant0']")).click();
		driver.findElement(By.xpath("//select[@id='titleInfant0']/child::option[2]")).click();
		driver.findElement(By.xpath("//input[@id='txtFNInfant0']")).sendKeys("aashavi");
		driver.findElement(By.xpath("//input[@id='txtLNInfant0']")).sendKeys("sharma");
		driver.findElement(By.xpath("//select[@id='divDOBDayInfant0']")).click();
		driver.findElement(By.xpath("//select[@id='divDOBDayInfant0']/child::option[32]")).click();
		driver.findElement(By.xpath("//select[@id='divDOBMonInfant0']")).click();
		driver.findElement(By.xpath("//select[@id='divDOBMonInfant0']/child::option[2]")).click();
		driver.findElement(By.xpath("//select[@id='divDOBYarInfant0']")).click();
		driver.findElement(By.xpath("//select[@id='divDOBYarInfant0']/child::option[2]")).click();
		driver.findElement(By.xpath("//input[@id='txtCPhone']")).click();
		driver.findElement(By.xpath("//input[@id='txtCPhone']")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='spnTransaction']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-A']")).click();
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-B']")).click();
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-C']")).click();
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-D']")).click();
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-E']")).click();
		driver.findElement(By.xpath("//label[@id='DEL_AMD5-F']")).click();
		driver.findElement(By.xpath("//span[@ng-click='AddAncillaryPreTransaction();']")).click();

	}

}
