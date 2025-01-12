package practice1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebElement;
import java.util.function.Function;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NewHomeloanhomeapplication
{
    private static void windowSwitch(final WebDriver driver) {
    }
    
    public static void main(final String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        final WebDriver driver = (WebDriver)new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().deleteAllCookies();
        driver.get("https://www.magicbricks.com/homeloan/home");
        driver.manage().window().maximize();
        final WebElement profileMenu = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/a"));
        final Actions actions = new Actions(driver);
        actions.moveToElement(profileMenu).perform();
        final WebElement loginbtn = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
        actions.moveToElement(loginbtn);
        loginbtn.click();
        windowSwitch(driver);
        final String parentwindow = driver.getWindowHandle();
        final Set<String> window2 = (Set<String>)driver.getWindowHandles();
        for (final String child_window : window2) {
            if (!parentwindow.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
        final WebElement button = driver.findElement(By.id("btnStep1"));
        final WebElement loginbutton = driver.findElement(By.id("btnLogin"));
        System.out.println("starting");
        driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("kushsharma232@gmail.com");
        button.click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("time@1234");
        loginbutton.click();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        driver.navigate().to("https://www.magicbricks.com/homeloan/home");
        driver.switchTo().window(parentwindow);
        driver.navigate().refresh();
        System.out.println("Page Refreshed");
        driver.findElement(By.xpath("//*[@id=\"monthlyIncome\"]")).sendKeys(new CharSequence[] { "100000" });
        System.out.println("100000");
        final JavascriptExecutor js2 = (JavascriptExecutor)driver;
        js2.executeScript("document.getElementById('generate-otp').click();", new Object[0]);
        Thread.sleep(3000L);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //final WebDriverWait wait = new WebDriverWait(driver, 1000L);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.id("generate-otp")));
        driver.findElement(By.id("generate-otp")).click();
        System.out.println("Getstarted");
        driver.findElement(By.xpath("//*[@id=\"hlname\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"hlname\"]")).sendKeys(new CharSequence[] { "Kush Sharma" });
        driver.findElement(By.xpath("//*[@id=\"loanAmount\"]")).sendKeys(new CharSequence[] { "1000000" });
        driver.findElement(By.id("shortlistedY")).click();
        driver.findElement(By.xpath("//*[@id=\"NameCityOnly\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"NameCityOnly\"]")).sendKeys(new CharSequence[] { "ghaziab" });
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"cityDropdownWebList\"]/li")).click();
        driver.findElement(By.xpath("//*[@id=\"propValue\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"propValue\"]")).sendKeys(new CharSequence[] { "5000000" });
        driver.findElement(By.xpath("//*[@id=\"formSections\"]/div[12]/div/div[12]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"emailId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys(new CharSequence[] { "kushsharma232@gmail.com" });
        driver.findElement(By.xpath("//*[@id=\"age\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys(new CharSequence[] { "30" });
        driver.findElement(By.id("genderM")).click();
        driver.findElement(By.xpath("//*[@id=\"formSections\"]/div[12]/div/div[12]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"empType16121\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ongoingEMI\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"ongoingEMI\"]")).sendKeys(new CharSequence[] { "10000" });
        driver.findElement(By.xpath("//*[@id=\"creditScoreExistsY\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"creditScore\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"creditScore\"]")).sendKeys(new CharSequence[] { "123" });
        driver.findElement(By.xpath("//*[@id=\"coapplicantExistsY\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"noOfCoapplicants1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"formSections\"]/div[12]/div/div[12]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"coapplName1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"coapplName1\"]")).sendKeys(new CharSequence[] { "Test" });
        driver.findElement(By.xpath("//*[@id=\"coapplRel1_4310661\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"coapplMobile1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"coapplMobile1\"]")).sendKeys(new CharSequence[] { "6543210987" });
        driver.findElement(By.xpath("//*[@id=\"coapplEmail1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"coapplEmail1\"]")).sendKeys(new CharSequence[] { "test@gmail.com" });
        driver.findElement(By.xpath("//*[@id=\"formSections\"]/div[12]/div/div[12]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"coapplEmpType1_16121\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"coapplIncome1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"coapplIncome1\"]")).sendKeys(new CharSequence[] { "100000" });
        driver.findElement(By.xpath("//*[@id=\"coapplCurrEMI1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"coapplCurrEMI1\"]")).sendKeys(new CharSequence[] { "1234" });
        driver.findElement(By.xpath("//*[@id=\"coapplCredScoreExistsN1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"formSections\"]/div[12]/div/div[12]/a[2]")).click();
        System.out.println("form submit your refrence number is");
        System.out.println(driver.findElement(By.xpath("//div[@class='mb-hl__revamp-form__thanks--text']//child::span")).getText());
    }
}