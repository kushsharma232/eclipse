package shivam.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
  public static void main(String[] args) throws InterruptedException {
   // System.out.println("Hello World!");
  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivam.Sharma\\\\Downloads\\\\chromedriver_win32 (3)//chromedriver.exe");

  WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.get("https://www.magicbricks.com/homeloan/home");

WebElement mainMenu = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[3]/a"));

//Instantiating Actions class
Actions actions = new Actions(driver);

//Hovering on Login 
//actions.moveToElement((WebElement) By.className("mb-header__main__link js-menu-link active")).perform();
actions.moveToElement((mainMenu));
//Locating the element from sub Menu
WebElement subMenu = driver.findElement(By.xpath("/html/body/header/section[1]/div/div[3]/div/div[2]/a"));

//To mouseover on sub menu
actions.moveToElement(subMenu);

//build()- used to compile all the actions into a single step 
actions.click().build().perform();
driver.get("https://accounts.magicbricks.com/userauth/login");
Thread.sleep(5000);

//WebElement emailMobile = driver.findElement(By.xpath("//div[@class='m-login__fieldset']/input[@id='emailOrMobile']"));
Thread.sleep(1000);

//emailMobile.sendKeys("kushsharma232@gmail.com");
//sendKeys("kushsharma232@gmail.com");
WebElement button = driver.findElement(By.id("btnStep1"));
Thread.sleep(5000);
System.out.println("starting");
driver.findElement(By.xpath("//div[@class='m-login__fieldset']/input[@id='emailOrMobile']")).sendKeys("kushsharma232@gmail.com");
Thread.sleep(5000);
button.click();
//driver.findElement(By.id("password")).sendKeys("Abcd@1234");
//driver.findElement(By.id("btnLogin")).click();

 }
  
}
