package Test;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

public class actionclass {

	private static final String By = null;

	public actionclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
		public static void main1(final String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam.Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        final WebDriver driver = (WebDriver)new WebDriver();
	        ((WebDriver) ((WebDriver) driver.manage()).timeouts()).implicitlyWait(5L, TimeUnit.SECONDS);
	        driver.get("https://jqueryui.com/droppable/");
	        ((WebDriver) driver.manage()).deleteAllCookies();
	        //driver.findElement(By.id("draggable")).click();
	        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class'demo-frame']")));
	       // driver.findElement(By.id("draggable")).click();
	        Action a =new Action(driver);
	        webElement source = driver.findElement(By.id("draggable"));
	        webElement target = driver.findElement(By.id("droppable"));
	        a.dragAndDrop(source, target).build.perform();
	        
	        System.out.println(driver.findElement(By.tagName("iframe")).size());
	        ((WebDriver) driver.switchTo()).frame(0);

	}

}
